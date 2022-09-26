package com.technoelevate.javabased;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class LaptopConfiguration {

	@Bean(autowire = Autowire.BY_TYPE )
	public Laptop getLaptop() {
		Laptop laptop = new Laptop();
		laptop.setBrand("HP");
		laptop.setColor("Black");
		laptop.setPrize(50000);
		laptop.setProcessor("Intel core I7");
		Battery battery = new Battery("HP MU06 Battery","7000mAh","Nickel Cadmium");
		laptop.setBattery(battery);
		
		return laptop;
	}
	@Bean(name="battery")
	public Laptop getBattery() {
		Laptop laptop = new Laptop();
		laptop.setBrand("HP");
		laptop.setColor("Black");
		laptop.setPrize(50000);
		laptop.setProcessor("Intel core I7");
		Battery battery = new Battery("Toshiba","7000mAh","smart battery");
		laptop.setBattery(battery);
		
		return laptop;
	}
	
	
}
