package com.scs.hibernatemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToOne {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		Dept1 d1 = new Dept1();
		d1.setDeptid(10);
		d1.setDeptname("IT");
		session.save(d1);
		Emp1 emp = new Emp1();
		emp.setEmpid(1001);
		emp.setEmpname("ABCD");
		emp.setDept(d1);
		Emp1 emp1 = new Emp1();
		emp1.setEmpid(1002);
		emp1.setEmpname("XYZ");
		emp1.setDept(d1);
		session.save(emp);
		session.save(emp1);
		tx.commit();
		session.close();
		
		
		

	}

}
