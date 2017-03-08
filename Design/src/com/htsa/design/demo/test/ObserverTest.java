package com.htsa.design.demo.test;

import com.htsa.design.observer.demo.ConditionsDisplayObj1;
import com.htsa.design.observer.demo.CurrentConditionsDisplay;
import com.htsa.design.observer.demo.WeatherData;

public class ObserverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		new CurrentConditionsDisplay(weatherData);
		new ConditionsDisplayObj1(weatherData);
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
		


	}

}
