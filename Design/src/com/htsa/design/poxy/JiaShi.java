package com.htsa.design.poxy;

public class JiaShi implements KindWoman {

	public JiaShi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eyesWithMan() {
		// TODO Auto-generated method stub
		System.out.println("Jiashi eyes with man....");
	}

	@Override
	public void happyWithMan() {
		// TODO Auto-generated method stub
		System.out.println("JiaShi happy with man....");
	}

	@Override
	public boolean isBill(int money) {
		// TODO Auto-generated method stub
		if (0 != money && money >= 600) {
			return true;
		}
		return false;
	}

}
