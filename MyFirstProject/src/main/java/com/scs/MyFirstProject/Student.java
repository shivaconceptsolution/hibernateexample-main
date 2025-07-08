package com.scs.MyFirstProject;

public class Student {
	private String name;
	private Integer rno;
	Student()
	{
		
	}
    Student(String name,Integer rno)
    {
    	this.name=name;
    	this.rno=rno;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
    public void displayCons() {
        System.out.println("Student Name: " + name + "Rno is "+rno);
    }
}
