package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Engineer extends Employee{
	//[자식 클래스 생성 시 '자식 클래스명 extends 부모 클래스명'의 형태로 작성]
	
	//기본적으로 Employee의 멤버를 물려받는다
	
	//자식의 멤버만 추가(필드 선언)
	private String tech;
	private int bonus;
	
	//명시적 생성자 추가 방법: source > 밑에서 두 번째 -> 부모의 멤버만으로 구성된 생성자가 만들어 짐 -> 자식의 멤버들은 지역변수로 추가
	//super. -> 부모 멤버에 접근
	//this. -> 자식 멤버에 접근
	public Engineer(String name, double salary, MyDate birthDate, String tech, int bonus) {
		super(name, salary, birthDate);
		this.tech = tech;
		this.bonus = bonus;
	}
	
	//1step 부모가 물려준 기능을 받아서 (메소드 선언부는 그대로)
	//2step 그걸 자신에게 맞게 고쳐 쓴다 (메소드 구현부는 다르게)
	//Method Overriding (메소드 재정의)
	
	@Override
	public String getDetails() {
		return super.getDetails()+" tech:"+tech;
	}
}
