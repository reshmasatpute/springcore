package com.technoelevate.springcore.assignment;

public class Employee  {
	private int id;
	private String name;
	private String designation;
	private Address address;
	
	public Employee() {
		
	}
	

	public Employee(int id, String name, String designation, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.address = address;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", address=" + address + "]";
	}
    
	
}
