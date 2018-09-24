package org.wx.test.adapter;

public class Moca extends Condiment{

	public Moca(Beverage beverage, String condimentName) {
		// TODO Auto-generated constructor stub
		super(beverage, condimentName);
	}
	
	public long cost() {
		return this.beverage.cost() + 20;
	}
	
	public String getDescription() {
		return this.CondimentName;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Espresso espresso = new Espresso("Espresso");
		System.out.println(espresso.getDescription());
		Moca moca = new Moca(espresso, "Moca");
		System.out.println(moca.getDescription());
		System.out.println(moca.cost());
	}

}
