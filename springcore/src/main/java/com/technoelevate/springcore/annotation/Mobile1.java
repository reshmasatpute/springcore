package com.technoelevate.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * create spring using annotation.@Componenet is able to create a bean.
 */
@Component()

public class Mobile1 {

	@Value("IPhone")
	private String name;

	@Value("Apple")
	private String brand;

	@Value("10000.0")
	private double price;

	@Value("black")
	private String color;
	
	@Autowired()
	private Display display;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	@Override
	public String toString() {
		return "Mobile1 [name=" + name + ", brand=" + brand + ", price=" + price + ", color=" + color + ", display="
				+ display + "]";
	}

	

}

