package com.technoelevate.springcore.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("Spring3.xml");
       Employee bean = context.getBean("emp1",Employee.class);
       
       ApplicationContext context2 = new ClassPathXmlApplicationContext("Spring3.xml");
       Employee bean2 = context2.getBean("emp2", Employee.class);
       System.out.println(bean);
       System.out.println(bean2);
       System.err.println("----------------------------------------------------------------------");
       bean.getAddress().address();
       bean2.getAddress().address();
       System.err.println("---------------------------------------------------------------");
     ApplicationContext context3 = new ClassPathXmlApplicationContext("Spring3.xml");
       Employee bean3 = context3.getBean("emp2", Employee.class);
       System.out.println(bean3);
	}
}
