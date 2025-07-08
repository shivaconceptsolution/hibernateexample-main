package com.scs.hibernatemapping;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OnetoManyExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		Dept d = new Dept();
		d.setDeptid(10);
		d.setDeptname("IT");
		Emp em = new Emp();
		em.setEmpid(1001);
		em.setEmpname("XYZ");
		Emp em1 = new Emp();
		em1.setEmpid(1002);
		em1.setEmpname("ABC");
		Set st = new HashSet<>();
		st.add(em);
		st.add(em1);
		d.setEmpref(st);
		session.save(d);
		session.getTransaction().commit();
		session.close();

	}

}
