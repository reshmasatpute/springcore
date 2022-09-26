package com.technoelevate.javabased;

public class Laptop {
	private String brand;
	private String color;
	private String processor;
	private int prize;
	private Battery battery;

	public Laptop() {
		// TODO Auto-generated constructor stub
	}

	public Laptop(Battery battery) {
		this.battery = battery;
	}

	public Battery getBattery() {
		return battery;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public int getPrize() {
		return prize;
	}

	public void setPrize(int prize) {
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", color=" + color + ", processor=" + processor + ", prize=" + prize
				+ ", battery=" + battery + "]";
	}

}
