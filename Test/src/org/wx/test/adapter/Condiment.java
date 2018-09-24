package org.wx.test.adapter;

public abstract class Condiment {
	
	protected  String CondimentName = "";
	Beverage beverage = null;
	
	public Condiment(Beverage beverage, String condimentName) {
		this.beverage = beverage;
		this.CondimentName = condimentName;
	}	
	
	public abstract String getDescription();
	
	public abstract long cost();
}
