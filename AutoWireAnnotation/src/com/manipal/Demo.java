package com.manipal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
public static void main(String[] args) {
	
	@SuppressWarnings("resource")
	ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
	Employee a = (Employee) ctx.getBean("emp");
	System.out.println(a);
	
}
}
