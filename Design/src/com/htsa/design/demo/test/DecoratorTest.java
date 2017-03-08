package com.htsa.design.demo.test;

import com.htsa.design.decorator.demo.Beverage;
import com.htsa.design.decorator.demo.Espresso;
import com.htsa.design.decorator.demo.Mocha;
import com.htsa.design.decorator.demo.Whip;

public class DecoratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Whip(new Mocha(new Espresso()));
		System.out.println(beverage.getDescription()+beverage.cost());
	}

}
