package com.scs.aopexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientCode {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("aopContext.xml");
		 A a=context.getBean("proxy",A.class);  
		 a.fun(); 

	}

}
