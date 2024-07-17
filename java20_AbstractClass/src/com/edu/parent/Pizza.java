package com.edu.parent;
/*
 * 추상 클래스의 용도
 * 1. 공통의 피자를 만들어 내기 위한 공통적인 작업은(필드, 메소드) 그대로 자식 클래스에 물려주고
 * 2. 반면에 서로 다른 여러 종류의 피자가 만들어질 수 있는 결정적인 부분은 추상 메소드로 물려준다
 * 	topping에 따라서 서로 다른 종류의 피자가 만들어 짐
 * 
 *  인터페이스와의 차이점 :: 추상성
 *  완벽한 추상성 ---> 인터페이스 ---> 사용자와 벤더 사이의 규약, 표준화
 *  부분적인 추상성 ---> 추상클래스 ---> 자식들을 구분짓는 결정적으로 서로 다른 부분들은 미완으로 물려준다(자식에서 완성하도록)
 */
public abstract class Pizza {
	protected int price;
	protected String storeName;
	
	public Pizza() {
		this(15000,  "PizzaHut");
	}
	
	public Pizza(int price, String storeName) {
		super();
		this.price = price;
		this.storeName = storeName;
	}
	
	//기능을 최종적으로 추가
	public void sequancePizza() {
		dough();
		
		topping(); //결정적으로 다른 피자를 만드는 부분
		
		bake();
		boxing();
		cutting();
	}
	
	public void dough() {
		System.out.println("피자 반죽과 함께 도우를 잘 만들어 줍니다");
	}
	
	public void bake() {
		System.out.println("180도 오븐에서 10분간 구워냅니다");
	}
	
	public void boxing() {
		System.out.println("잘려진 피자를 박스에 포장합니다");
	}
	
	public void cutting() {
		System.out.println("피자를 8조각으로 자릅니다");
	}
	
//	void topping(); //클래스는 추상 메소드를 못가지므로, 추상 메소드를 만들고 가져야 함
	
	public abstract void topping(); //abstract는 무조건 public (물려주어야 하기 때문)
	
	//정보를 리턴하는 기능
	@Override
	public String toString(){
		return "상점이름, "+storeName+"- 가격, "+price;
	}
}
