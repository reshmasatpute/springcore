package com.technoelevate.javabased;

public class Battery {
	private String brand;
	private String type;
	private String capacity;

	public Battery() {

	}

	public Battery(String brand, String type, String capacity) {
		super();
		this.brand = brand;
		this.type = type;
		this.capacity = capacity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Battery [brand=" + brand + ", type=" + type + ", capacity=" + capacity + "]";
	}

}
