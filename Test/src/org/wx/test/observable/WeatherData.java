package org.wx.test.observable;

import java.util.ArrayList;

public class WeatherData implements Subject {
	private int temperature = 0;
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifySubjects();
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		notifySubjects();
	}
	
	public int getPressure() {
		return pressure;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifySubjects();
	}

	private int humidity	 = 0;
	private int pressure	 = 0;
	
	private ArrayList<Observer> observers = null;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}
		
	public void notifySubjects() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}

	@Override
	public void register(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
	}

	@Override
	public void unRegister(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
	}

}
