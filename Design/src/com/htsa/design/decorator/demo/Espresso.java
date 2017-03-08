package com.htsa.design.decorator.demo;

public class Espresso extends Beverage {

	public Espresso() {
		super.description = "Espresso";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return 1.99f;
	}

}
