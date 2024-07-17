package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class PolyTest1 {

	public static void main(String[] args) {
		//자식 클래스 생성
		Manager m = new Manager("James", 30000.0, new MyDate(1999,1,1),"IT");
		Engineer eg = new Engineer("Tomas", 45000.0, new MyDate(1997, 3, 12), "Java", 100);
		Secretary s = new Secretary("Peter", 35000.0,new MyDate(2000,4,3),"James");
		
		m.changeDept("기획부"); //[Manager에 있는 changeDept() 호출]
		eg.changeTech("Python");
		s.changeNameOfBoss("Jane");
		
		System.out.println(m.toString()); //[Manager에 있는 toString()을 호출하여 얻은 문자열 값을 출력]
		System.out.println(eg.toString());
		System.out.println(s.toString());
		
		System.out.println("\n==== Polymorphism ====");
		//부모타입으로 다양한 자식객체 생성...반드시 알아야하는 것 1) Object Casting 2) Virtual Method Invocation
		Employee m2 = new Manager("James", 30000.0, new MyDate(1999,1,1),"IT");
		Employee eg2 = new Engineer("Tomas", 45000.0, new MyDate(1997, 3, 12), "Java", 100);
		Employee s2 = new Secretary("Peter", 35000.0,new MyDate(2000,4,3),"James");
		
		//1) Object Casting
		//Manager 타입으로 불러서(Object Casting) 값 할당...
		((Manager) m2).changeDept("교육부"); //밑의 두 줄을 한 줄로 줄인 것
//		Manager ma2 = (Manager)m2; //m2를 매니저 타입으로 부름
//		ma2.changeDept("교육부");
		//(부모타입으로 자식 객체를 생성한 뒤에 자식만의 멤버(필드, 메소드)를 사용하려면, 반드시 자식클래스로 캐스팅해서 자식만의 멤버 호출)

		
		//2) Virtual Method(자식의 메소드) Invocation
		//컴파일 단계에서의 메소드와 실행 단계에서의 메소드가 다름
		//상속 관계에 있는 2개의 클래스 사이에서 부모 타입으로 자식객체를 생성한 뒤
		//부모타입으로 오버라이딩 된 자식의 메소드를 호출하면 발생
		//(1) 컴파일 단계: 부모의 메소드로 저장
		//(2) 실행 단계: 자식의 멤버를 읽어내려가며 읽혀진, 자식이 고친 메소드가 실행됨
		System.out.println(m2.toString());

		
		//eg2 엔지니어의 기술을 AI로 변경,,, 보너스도 300달러로 변경
		//정보를 출력...확인
		((Engineer) eg2).changeTech("AI");
		((Engineer) eg2).changeBonus(300);
		System.out.println(eg2.toString());
		


		
	}

}
