package com.scs.MyFirstProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccessConstructorMap {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationMapContext.xml");
		StudentMap stu = (StudentMap)context.getBean("stucons");
		stu.showMapData();

	}

}
