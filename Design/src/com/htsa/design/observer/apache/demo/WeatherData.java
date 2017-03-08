package com.htsa.design.observer.apache.demo;

import java.util.Observable;

public class WeatherData extends Observable {

	private float temperature;

	private float humidity;

	private float pressure;

	public WeatherData() {
	}

	public void measurementsChange() {
		super.setChanged();
		super.notifyObservers();
	}

	public void setMeasurements(float temperature, float humidity,
			float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChange();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
