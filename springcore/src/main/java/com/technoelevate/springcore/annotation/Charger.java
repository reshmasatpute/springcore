package com.technoelevate.springcore.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Charger {
	@Value("apple")
	private String brand;
	@Value("500")
	private double price;
	@Value("50mA")
	private String voltage;

	public Charger() {
		// TODO Auto-generated constructor stub
	}

	public Charger(String brand, double price, String voltage) {
		super();
		this.brand = brand;
		this.price = price;
		this.voltage = voltage;
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

	public String getVoltage() {
		return voltage;
	}

	public void setVoltage(String voltage) {
		this.voltage = voltage;
	}

	@Override
	public String toString() {
		return "Charger [brand=" + brand + ", price=" + price + ", voltage=" + voltage + "]";
	}

}
