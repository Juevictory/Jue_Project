package com.htsa.design.category.demo;


public class MallardDuck extends Duck {

	public MallardDuck() {
		super.quackBehavior = new Quack();
		super.flyBehavior = new FlyWithWings();
	}

	@Override
	public void swin() {
		// TODO Auto-generated method stub

	}
}
