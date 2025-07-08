package com.scs.MyFirstProject;

public class A {
	B b1;  
	A()
	{
		System.out.println("a is created");
	} 
	void print()
	{
		System.out.println("hello a");
	} 
	
	public B getB() 
	{
		return b1;
	}
	public void setB(B b)
	{
		this.b1 = b;
	}
	void display(){  
	    print();  
	    b1.print();  
		}  
}
