package org.wx.test.observer.pizzas;

public class PizzaFactory {
	public void createPizza(String pizzaType){
		if (pizzaType == "newyorkstyle") {
			System.out.println("newyork style pizza.");
		}else if (pizzaType == "chicagostype") {
			System.out.println("chicago style pizza");
		}else if (pizzaType == "californiastyle") {
			System.out.println("california stype pizza");
		}
	}
}
