package com.technoelevate.springcore;

public class OracleDatabase implements Database{

	@Override
	public void save() {
	
		System.out.println("save using oracle database!!1");
	}

}
