package com.technoelevate.javabased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(LaptopConfiguration.class);
      Laptop bean = context.getBean("battery",Laptop.class);
      System.out.println(bean);
	}
}
