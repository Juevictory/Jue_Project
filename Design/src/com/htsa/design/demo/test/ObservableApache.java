package com.htsa.design.demo.test;

import com.htsa.design.observer.apache.demo.CurrentConditionsDisplay;
import com.htsa.design.observer.apache.demo.WeatherData;

public class ObservableApache {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
