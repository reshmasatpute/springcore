package com.technoelevate.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Spring1.xml");
      User bean = context.getBean("user1", User.class);
      bean.setDatabase(null);
   
	}
}
