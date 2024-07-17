package com.edu.service;

import com.edu.parent.Pizza;

//Template 기능만을 모아놓은 서비스 인터페이스...
public interface PizzaService {
	void allMakePizza(Pizza[] pizzas); //앞에 퍼블릭 앱스트랙트가 생략되어 있음
}
