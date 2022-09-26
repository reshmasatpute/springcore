package com.technoelevate.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
     ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
     Mobile bean = context.getBean(Mobile.class);
     System.out.println(bean);
	}
}
