package com.htsa.design.category.demo;


public abstract class Duck {

	QuackBehavior quackBehavior;

	FlyBehavior flyBehavior;

	// Ѽ�ӷ�����Ϊ����
	public void performFly() {
		flyBehavior.fly();
	}

	// Ѽ�ӽд���
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
