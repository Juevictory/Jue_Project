/**
 * 
 */
package com.htsa.design.decorator.demo;

/**
 * @author JueVictory
 * 
 */
public class HouseBlend extends Beverage {

	/**
	 * 
	 */
	public HouseBlend() {
		// TODO Auto-generated constructor stub
		super.description = "HouseBlend";
	}

	@Override
	public float cost() {
		// TODO Auto-generated method stub
		return .89f;
	}

}
