package com.technoelevate.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml", "Spring1.xml", "Spring3.xml");
		User bean = context.getBean("user1", User.class);
		bean.getDatabase().save();
		System.out.println(bean);

		

	}
}
