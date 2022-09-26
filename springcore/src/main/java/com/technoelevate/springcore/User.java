package com.technoelevate.springcore;

public class User   {
	private int id;
	private String name;
	private int age;
	
	private Database database;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	
	public User(int id, String name, int age, Database database) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.database = database;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public Database getDatabase() {
		return database;
	}
	public void setDatabase(Database database) {
		this.database = database;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
    
}
