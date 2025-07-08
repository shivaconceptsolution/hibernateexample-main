package com.scs.FactoryExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class ExecuteFactoryBean {
 public static void main(String args[])
 {
	 ApplicationContext context=new ClassPathXmlApplicationContext("factoryContext.xml");
     B a=(B)context.getBean("b");
     a.DisplayB();
 }
}
