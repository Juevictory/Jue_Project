package com.htsa.design.factory.demo.one;

public class Pizza {

	Pizza pizza;
	
	public Pizza() {
		// TODO Auto-generated constructor stub
	}

	public void prepare() {
		System.out.println("prepare Pizza");
	}

	public void bake() {
		System.out.println("Bake Pizza");
	}

	public void cut() {
		System.out.println("Cut Pizza");
	}

	public void box() {
		System.out.println("Box Pizza");
	}
}
