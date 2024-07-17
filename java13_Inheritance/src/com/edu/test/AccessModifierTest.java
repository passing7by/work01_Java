package com.edu.test;

import com.edu.child.Child;
import com.edu.parent.Parent;

public class AccessModifierTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("==== Parent의 함수 호출입니다 ====");
		p.access(); //부모의  access 호출
		
		Child c = new Child();
		System.out.println("==== Child의 함수 호출입니다 ====");
		c.childAccess();
		
		System.out.println("==== Overriding된 함수 호출 ====");
		c.access(); //자식의 access 호출
		//둘째줄 ~ 다섯째줄 출력되는 이유: super.access();
		
		//같은 access()지만 다른 값 출력되는 이유: 참조하는 변수의 클래스 타입이 다르며,
		//각 클래스 타입(Parent, Child)의 access()는 선언부는 같으나, 구현부가 다름
	}

}
