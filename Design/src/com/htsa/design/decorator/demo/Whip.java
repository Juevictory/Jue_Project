package com.htsa.design.decorator.demo;

public class Whip extends ComdimentDecotator {

	Beverage beverage;

	public Whip(Beverage beverage) {
		// TODO Auto-generated constructor stub
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription() + "-"
				+ this.getClass().getSimpleName();
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return .5f + beverage.cost();
	}

}
