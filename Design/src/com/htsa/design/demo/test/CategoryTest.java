package com.htsa.design.demo.test;

import org.junit.Test;

import com.htsa.design.category.demo.Duck;
import com.htsa.design.category.demo.FlyWithRocket;
import com.htsa.design.category.demo.MallardDuck;

public class CategoryTest {

	@Test
	public void test() {
		Duck mallard = new MallardDuck();
		mallard.performFly();
		mallard.performQuack();
		mallard.setFlyBehavior(new FlyWithRocket());
	}

}
