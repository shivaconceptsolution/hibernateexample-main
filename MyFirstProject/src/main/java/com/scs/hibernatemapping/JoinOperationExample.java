package com.scs.hibernatemapping;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class JoinOperationExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		SessionFactory sf = cfg.configure().buildSessionFactory();
		Session session = sf.openSession();
	//	Query q = session.createQuery("select d.deptname,e.empname from Dept d inner join d.empref e");
		Query q = session.createQuery("select d.deptname,e.empname from Dept d left join d.empref e");
	//	Query q = session.createQuery("select d.deptname,e.empname from Emp1 e inner join e.dept d");
		List lst = q.list();
		Iterator it = lst.iterator();
		while(it.hasNext())
		{
			Object arr[]= (Object[])it.next();
			System.out.println("Deptname is "+arr[0] + " Employee name is "+arr[1]);
		}
		session.close();

	}

}
