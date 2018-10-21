package org.wx.test.observer.pizzas;

public class PizzaStore {
	
	private PizzaFactory pizzaFactory = null;
	public PizzaStore(PizzaFactory pizzaFactory){
		this.pizzaFactory = pizzaFactory;
	}
	
	public void orderPizza(String pizzaType){
		if (pizzaType != null) {
			pizzaFactory.createPizza(pizzaType);
		}
	}
}
