package com.technoelevate.springcore.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
      ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
      Mobile1 bean = context.getBean(Mobile1.class);
      System.out.println(bean.getName()+" has a "+bean.getDisplay().getDisplay());
	}
}
