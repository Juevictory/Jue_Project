package com.htsa.design.poxy;

public class WangPo implements KindWoman {

	private KindWoman kindWoman;

	public WangPo() {
		// TODO Auto-generated constructor stub
		this.kindWoman = new PanJinLian();
	}

	public WangPo(KindWoman kindWoman) {
		this.kindWoman = kindWoman;
	}

	@Override
	public void eyesWithMan() {
		// TODO Auto-generated method stub
		this.kindWoman.eyesWithMan();
	}

	@Override
	public void happyWithMan() {
		// TODO Auto-generated method stub
		this.kindWoman.happyWithMan();
	}

	public boolean isBill(int money) {
		return this.kindWoman.isBill(money - 100);
	}

	public void wangPoGetMoney(int money) {
		if (this.isBill(money)) {
			this.happyWithMan();
		} else {
			System.out.println(this.kindWoman.getClass().getSimpleName()
					+ " will not ml, lack money ");
		}
	}

}
