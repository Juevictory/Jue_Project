package com.htsa.design.observer.demo;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	private float temperature;

	private float humidity;

	public CurrentConditionsDisplay(Subject weatherData) {
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.humidity = humidity;
		this.temperature = temperature;
		this.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current conditiond:" + temperature
				+ "F degrees and " + humidity + "% humidity");
	}
}
