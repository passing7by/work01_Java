package com.edu.datatype.test;

public class DataTypeTest {

	public static void main(String[] args) {
		float salary = 100; //지역변수는 기본값이 없으므로(필드가 아니기 때문에), 반드시 초기화(값을 지정)하고 사용해야 함
		System.out.println(salary * 100);
		
		double salary1 = 100.0; //long float double 의 세 가지 타입은 값 뒤에 무조건 데이터 타입이 지정된 값임
		System.out.println(salary1);
		
		float salary2 = 100.0F; //100.0 --> double 타입, 하지만 플롯 타입으로 바꿔주기 위해 값 뒤에 "F" 붙여줌
		System.out.println(salary2);
		
		long salary3 = 1230000000L; //long 타입으로 바꿔주기 위해 값 뒤에 "L" 붙여줌
		System.out.println(salary3);
		
		short a, b;
		a = 1;
		b = 2;
		short c = (short)(a + b);
		//int 이하의 값에서 사칙연산이 일어나면, int로 승격됨
		//변수(ex. x, y, ...)가 들어가면 타입비교가 먼저 되고, 값(ex. 24)이 들어가면 값의 범위 비교가 바로 됨
		
		System.out.println(c);				
	}
}
