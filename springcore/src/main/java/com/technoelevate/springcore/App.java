package com.technoelevate.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.err.println("-----------------------------------------------");
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml","Spring1.xml");
		User bean = context.getBean("user1",User.class);
		System.out.println(bean);
		bean.getDatabase().save();	
		
		User bean2 = context.getBean("user2",User.class);
		System.out.println(bean2);
		bean2.getDatabase().save();
		
		User bean3 = context.getBean("testUser",User.class);
		bean3.getDatabase().save();
		
		
		
		
		
		
		
		
		
		
	}
}
