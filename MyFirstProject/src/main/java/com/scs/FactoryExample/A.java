package com.scs.FactoryExample;

public class A {
	 private static final B obj=new B();
	 private A()
	    {
	        System.out.println("private constructor");
	    }
	 public B getB()
	    {
	           System.out.println("factory method ");
	           obj.DisplayB();
	           return obj;
	    }
	 
}
