/*
 * Access Modifier ::: public < protected < private
 * Usage Modifier ::: static, final, abstract
 * 
 * static + final 주로 함께 많이 쓰인다. (순서는 중요하지 않다)
 * final ::: "내가 마지막이야~~~" 라는 의미를 가지는 키워드
 * final + 변수 --> "내가 마지막 변수야" = 상수값 지정(값이 미래에 변경되지 않음)
 * final + 메소드 --> "내가 마지막 클래스야" = 상속 금지(미래에 이 클래스의 자식이 생기지 않음)
 * final + 클래스 --> "내가 마지막 메소드야" = 오버라이딩 금지(부모의 기능을 훼손하지 않는 메소드를 사용하고 싶을 때)
 * 
 */
package com.edu.statictest;

class A{
	public final static int BASE_SALARY = 4000; //상수
	public final String test() {
		return "Overriding 금지";
	}
}

final class B{ //상속 금지
	
}

//class C extends B{
//	
//}

class D extends A{
//	public final String test() {
//		return "Overriding 금지";
//	}
}

public class StaㅅicExamTest4 {

	public static void main(String[] args) {
//		A.BASE_SALARY=500; //값 변경 불가

	}

}
