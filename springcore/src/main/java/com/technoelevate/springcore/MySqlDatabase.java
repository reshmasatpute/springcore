package com.technoelevate.springcore;

public class MySqlDatabase implements Database{

	@Override
	public void save() {
		System.out.println("save using mysql database!!!!");
		
	}

}
