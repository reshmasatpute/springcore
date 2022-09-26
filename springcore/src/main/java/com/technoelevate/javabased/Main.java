package com.technoelevate.javabased;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Spring4.xml");
		Demo bean = context.getBean(Demo.class);
		bean.m1();
	}
}
