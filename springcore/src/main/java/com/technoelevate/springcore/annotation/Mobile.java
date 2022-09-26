package com.technoelevate.springcore.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*
 * create spring using annotation.@Componenet is able to create a bean.
 */
@Component()

public class Mobile {

	@Value("IPhone")
	private String name;

	@Value("Apple")
	private String brand;

	@Value("10000.0")
	private double price;

	@Value("black")
	private String color;
	
	@Autowired()
	private Charger charger;

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

	public Charger getCharger() {
		return charger;
	}

	public void setCharger(Charger charger) {
		this.charger = charger;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", brand=" + brand + ", price=" + price + ", color=" + color + ", charger="
				+ charger + "]";
	}

}
