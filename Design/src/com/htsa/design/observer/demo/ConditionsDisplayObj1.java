package com.htsa.design.observer.demo;

public class ConditionsDisplayObj1 implements Observer, DisplayElement {

	private float pressure;

	private float humidity;

	public ConditionsDisplayObj1(WeatherData weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditiond Obj1:" + pressure + "Par and "
				+ humidity + "% humidity");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.pressure = pressure;
		this.humidity = humidity;
		// 在对象变化 时就 显示
		this.display();
	}

}
