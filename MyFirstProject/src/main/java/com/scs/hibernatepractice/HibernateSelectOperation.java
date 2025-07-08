package com.scs.hibernatepractice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class HibernateSelectOperation {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		Query q = session.createQuery("from Student",Student.class);
		List<Student> s = q.getResultList();
		for(Student obj:s)
		{
			System.out.println("rno"+obj.getRno() + " name is "+obj.getSname());
		}

	}

}
