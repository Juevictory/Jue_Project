package com.htsa.design.category.demo;


public abstract class Duck {

	QuackBehavior quackBehavior;

	FlyBehavior flyBehavior;

	// 鸭子飞行行为代理
	public void performFly() {
		flyBehavior.fly();
	}

	// 鸭子叫代理
	public void performQuack() {
		quackBehavior.quack();
	}

	public abstract void swin();

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

}
