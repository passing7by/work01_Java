package com.edu.service.impl;

import com.edu.parent.Pizza;
import com.edu.service.PizzaService;

public class PizzaServiceImpl implements PizzaService{

	//싱글톤
	//1. 
	private static PizzaServiceImpl service = new PizzaServiceImpl();
	private PizzaServiceImpl() {} //2.
	public static PizzaServiceImpl getInstance() {
		return service;
	}
	
	@Override
	public void allMakePizza(Pizza[] pizzas) {
		for(Pizza p : pizzas) {
			System.out.println(p);
			p.sequancePizza();
			System.out.println("=============================");
		}//for
	}//method
}//class
