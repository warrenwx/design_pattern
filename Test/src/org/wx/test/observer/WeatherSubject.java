package org.wx.test.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject {
	
	private List<Observer> observers = new ArrayList<Observer>();
	
	private int temperature = 0;
	private int humidityu 	= 0;
	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifyObservers();
	}

	public void setHumidityu(int humidityu) {
		this.humidityu = humidityu;
		notifyObservers();
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		notifyObservers();
	}

	private int pressure 	= 0;
	
	@Override
	public void regiter(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
		notifyObservers();
	}

	@Override
	public void unRegister(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
	}
	
	private void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidityu, pressure);
		}
	}

}
