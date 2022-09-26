package com.technoelevate.javabased;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Demo implements InitializingBean, DisposableBean {

	public void m1() {
      System.out.println("This is from m1 ");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destruction");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After initilizing a bean");
	}

}
