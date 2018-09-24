package org.wx.test.adapter;

public abstract class Beverage {

	protected String description = "";
	
	public Beverage() {
		this.description = "Unknown beverage";
	}
	
	public abstract String getDescription();
	public abstract long cost();

}
