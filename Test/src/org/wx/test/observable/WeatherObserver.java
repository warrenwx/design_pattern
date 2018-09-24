package org.wx.test.observable;

public class WeatherObserver implements Observer{
	
	long temperature = 0;
	long humidity    = 0;
	long pressure    = 0;
	
	Observer Observer = null;
	
	@Override
	public void update(long temperature, long humidity, long pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity 	 = humidity;
		this.pressure    = pressure;
		display();
	}
	
	public void display() {
		System.out.println("Temperature:" + temperature);
		System.out.println("Humidity:" + humidity);
		System.out.println("Pressure:" + pressure);
	}
	
	public static void main(String[] args) {
		
		WeatherObserver weatherObserver = new WeatherObserver();
		WeatherData weatherData = new WeatherData();
		
		weatherData.register(weatherObserver);
		weatherData.setTemperature(37);
		weatherData.setHumidity(10);
		weatherData.setPressure(990 );
	}
}
