package com.scs.MyFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Hello {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 Student s = (Student) context.getBean("stucons");
        // Get the Student bean from the context
		// s("Manish Joshi",1);
    //   Student s = (Student) context.getBean("student");
      //  s.setName("Manish Kumar");
        // Call a method on the bean
        s.displayCons();

	}

}
