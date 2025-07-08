package com.scs.hibernatepractice;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class CriteriawithRestriction {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria c= session.createCriteria(Student.class);
	//	Criterion ct= Restrictions.gt("rno",1002);
	//	Criterion ct= Restrictions.ge("rno",1002);
	//	Criterion ct= Restrictions.eq("rno",1002);
	//	Criterion ct= Restrictions.lt("rno",1002);
	//	Criterion ct= Restrictions.le("rno",1002);
	//	Criterion ct= Restrictions.like("sname","%1");
		List<Integer> lst = new ArrayList<Integer>();
		lst.add(1001);
		lst.add(1007);
		Criterion ct=Restrictions.in("rno",lst);
		//Criterion ct= Restrictions.between("rno",1003,1007);
		c.add(ct);
		List<Student> s = c.list();
		for(Student obj:s)
		{
			System.out.println("rno "+obj.getRno() + " name is "+obj.getSname());
		}

	}

}
