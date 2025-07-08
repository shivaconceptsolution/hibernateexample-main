package com.scs.hibernatepractice;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectionExampleInHibernate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria c= session.createCriteria(Student.class);
		c.setProjection(Projections.property("sname"));
		List lst = c.list();
		for(Object item:lst)
		{
			System.out.println("name is "+item);
		}

	}

}
