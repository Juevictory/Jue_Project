/**
 * 
 */
package com.htsa.design.decorator.demo;

/**
 * @author JueVictory
 * 
 */
public class Mocha extends ComdimentDecotator {

	Beverage beverage;

	/**
	 * 
	 */
	public Mocha(Beverage beverage) {
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
		return 0.2f + this.beverage.cost();
	}

}
