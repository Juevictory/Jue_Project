package com.htsa.design.observer.apache.demo;

import java.util.Observable;
import java.util.Observer;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

	Logger log = Logger.getLogger(this.getClass());
	Observable observable;

	private float temperature;

	private float humidity;

	public CurrentConditionsDisplay(Observable observable) {
		BasicConfigurator.configure();
		this.observable = observable;
		observable.addObserver(this);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update(Observable obse, Object arg1) {
		// TODO Auto-generated method stub
		if (obse instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obse;
			this.humidity = weatherData.getHumidity();
			this.temperature = weatherData.getTemperature();
			display();
		}

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		StringBuilder sub = new StringBuilder(128);
		sub.append("Current conidition:").append(this.temperature)
				.append("F degrees----");
		sub.append(this.humidity).append("% humidity");
		log.info(sub);
	}

}
