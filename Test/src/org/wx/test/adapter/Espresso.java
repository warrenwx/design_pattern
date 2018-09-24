package org.wx.test.adapter;

public class Espresso extends Beverage{

	public Espresso(String beverageName) {
		this.description = beverageName;
	}	

	@Override
	public long cost() {
		// TODO Auto-generated method stub
		return 10;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Espresso espresso = new Espresso("Ecpresso");
		System.out.println(espresso.cost());
	}

}
