package com.scs.hibernatepractice;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionExampleWithMultipleColumns {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria c= session.createCriteria(Student.class);
		ProjectionList p1 = Projections.projectionList();
		p1.add(Projections.property("sname"));
		p1.add(Projections.property("fees"));
		c.setProjection(p1);
		List lst = c.list();
		for(Object item:lst)
		{
			Object arr[] =(Object[])item;
			System.out.println("name is "+arr[0] + " fees is "+arr[1]);
		}
		

	}

}
