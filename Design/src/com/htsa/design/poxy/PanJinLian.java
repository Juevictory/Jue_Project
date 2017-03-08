package com.htsa.design.poxy;

public class PanJinLian implements KindWoman {

	public PanJinLian() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public void eyesWithMan() {
		// TODO Auto-generated method stub
		System.out.println("Panjinlian eye with man.....");

	}

	@Override
	public void happyWithMan() {
		// TODO Auto-generated method stub
		System.out.println("Pan jing lian happy with man.....");
	}

	@Override
	public boolean isBill(int money) {
		// TODO Auto-generated method stub
		if (0 != money && money >= 500) {
			return true;
		}
		return false;
	}

}
