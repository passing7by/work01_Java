package com.edu.overloading.test;
//vo 클래스 - DB의 테이블과 매핑됨, 클래스명=테이블명=Entity
class Employee{
	private int empno;
	private String name;
	private double salary;
	private String address;
	
	public static final double BASIC_SALARY = 100.0;
	public static final String BASIC_ADDR = "NY";
	//static 변수 선언 - 고정값(상수)로 설정하기 위해 'final'을 붙임
	
	//모든 클래스에는 항상 생성자가 하나 이상 있음
	Employee(){} //기본 생성자가 하는 일: 아무것도 안 함

	public Employee(int empno, String name, double salary, String address) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}
	
	public Employee(int empno, String name) {
		//this(); -> 14라인이 호출되어 기본값으로 채워짐
		this(empno,name,BASIC_SALARY,BASIC_ADDR); //16라인으로 가서 값과 static 값으로 채워짐
	}
	
	/*
	 * this 키워드
	 * 1) this.empno = empno;
	 * --> 필드와 로컬변수의 이름이 같을 때 둘을 구분하기 위해서 필드 앞에 지정
	 * 2) this(empno,name,BASIC_SALARY,BASIC_ADDR);
	 * --> 생성자 앞의 this는 같은 클래스 내에서 또다른 생성자(인자값이 꽉 찬 명시적 생성자)를 호출할 때 사용
	 */
	
	public String toString() { //getDetails 대신 toString 호출
		return empno+","+name+","+salary+","+address;
	}

}//Employee

public class OverloadingTest {

	public static void main(String[] args) {
		Employee e1 = new Employee(7369,"SCCOT",30000,"Texas");
		Employee e2 = new Employee(7521,"SCCOT",30000,"Texas");
		
		/*
		 * 생성자 오버로딩
		 * 필수정보만으로 객체생성을 할 수 있어야 함
		 * 객체를 생성할 때 인자값을 달리 입력해서 객체를 생성하는 기법
		 */
		Employee e3 = new Employee(7899,"BLAKE");

		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

		
	}

}
