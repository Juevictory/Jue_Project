package com.htsa.design.decorator.demo;

public abstract class Beverage {

	protected String description = "Unknow name beverage";

	
	
	public String getDescription() {
		return description;
	}



	public abstract float cost();
}
