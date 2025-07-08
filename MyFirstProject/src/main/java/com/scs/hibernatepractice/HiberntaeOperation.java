package com.scs.hibernatepractice;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class HiberntaeOperation {
	Configuration cfg ;
	SessionFactory sf;
	Session session ;
    public void addStudentRecord(int rno,String sname,String branch,int fees)
    {
	    cfg= new Configuration();
		sf = cfg.configure().buildSessionFactory();
		session= sf.openSession();
		session.beginTransaction();
		Student student = new Student();
		student.setRno(rno);
		student.setSname(sname);
		student.setBranch(branch);
		student.setFees(fees);
		session.save(student);
		session.getTransaction().commit();
		session.close();
	    this.selectStudentRecord();
   }
    public void updateStudentRecord(int rno,String sname,String branch,int fees)
    {
    	cfg= new Configuration();
		sf = cfg.configure().buildSessionFactory();
		session= sf.openSession();
		session.beginTransaction();
		Student student = session.get(Student.class,rno);
		student.setSname(sname);
		student.setBranch(branch);
		student.setFees(fees);
	    session.update(student);
	    session.getTransaction().commit();
	    session.close();
	    this.selectStudentRecord();
	    
    }
    public void findStudentRecord(int rno)
    {
    	cfg= new Configuration();
		sf = cfg.configure().buildSessionFactory();
		session= sf.openSession();
		session.beginTransaction();
		Student student = session.get(Student.class,rno);
		System.out.println("rno is "+student.getRno()+ " name is "+student.getSname() + " branch is "+student.getBranch() + " fees is "+student.getFees());
		
	    session.close();
	   // this.selectStudentRecord();
	    
    }
    public void deleteStudentRecord(int rno)
    {
    	cfg= new Configuration();
		sf = cfg.configure().buildSessionFactory();
		session= sf.openSession();
		session.beginTransaction();
		Student student = session.get(Student.class,rno);
		session.delete(student);
	    session.getTransaction().commit();
	    session.close();
	    this.selectStudentRecord();
    }
    
    public void selectStudentRecord()
    {
    	 cfg = new Configuration();
		 sf = cfg.configure().buildSessionFactory();
		 session = sf.openSession();
		 Query q = session.createQuery("from Student",Student.class);
		 List<Student> s = q.getResultList();
		 for(Student obj:s)
		 {
			System.out.println("rno " + obj.getRno() + " name is "+obj.getSname());
		 }
         session.close();
    }
    public void selectStudentRecordByBranch(String branch)
    {
    	 cfg = new Configuration();
		 sf = cfg.configure().buildSessionFactory();
		 session = sf.openSession();
		 Query q = session.createQuery("from Student s where branch=:b",Student.class);
		 q.setString("b", branch);
		 List<Student> s = q.getResultList();
		 for(Student obj:s)
		 {
			System.out.println("rno " + obj.getRno() + " name is "+obj.getSname());
		 }
         session.close();
    }
	public static void main(String[] args) {
		
		HiberntaeOperation obj = new HiberntaeOperation();
		obj.selectStudentRecordByBranch("CS");
	//	obj.findStudentRecord(1001);
	//	obj.deleteStudentRecord(1008);
	
	}

}
