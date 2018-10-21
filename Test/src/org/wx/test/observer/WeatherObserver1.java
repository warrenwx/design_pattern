package org.wx.test.observer;

public class WeatherObserver1 implements Observer {
	
	int temperature = 0;
	int humidity	= 0;
	int pressure	= 0;
	
	@Override
	public void update(int temperature, int humidity, int pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}
	
	private void display(){
		System.out.println("temperature:" + temperature +", humidity:" + humidity + ", pressure:" + pressure);
	}
	
	public static void main(String[] args){
		WeatherSubject weatherSubject = new WeatherSubject();
		WeatherObserver1 weatherObserver1= new WeatherObserver1();
		weatherSubject.regiter(weatherObserver1);
		
		weatherSubject.setTemperature(90);
		weatherSubject.setHumidityu(80);
		weatherSubject.setPressure(100);
	}

}
