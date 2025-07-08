package com.scs.hibernatepractice;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;

public class CriteriaMain {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria c= session.createCriteria(Student.class);
		
		List<Student> s = c.list();
		for(Student obj:s)
		{
			System.out.println("rno "+obj.getRno() + " name is "+obj.getSname());
		}

	}

}
