package com.edu.parent;
/*
 * 인터페이스는 추상 메소드들의 집합 + public static final 상수 값
 * 완벽한 미완성 설계도, 인스턴스의 대상은 안됨(객체 생성의 대상은 안 됨). 추상화 대상
 * ==
 * public abstract 메소드와 public static final 상수값으로 구성됨
 * Template 기능 위주의 모듈
 * ; : statement의 종결, Calling기능을 함.
 * 필드는 제공되지 않는다.
 */
public interface Flyer {
//interface인 'Flyer' 작성
	int MAX_SPEED = 200;//public static final이 생략되어있음.(필드 아님)
	//[모든 멤버 변수는 public static final이어야 하며, 이를 생략 가능]
	//[인터페이스는 템플릿 -> 멤버 변수의 값이 바뀌면 안되겟지..다른 클래스에서도 접근 가능해야하겟지..]
	
	void fly();//public abstract가 생략되어어져 있다. (인터페이스이기 때문에)
	//[모든 메소드는 public abstract이어야 하며, 이를 생략 가능]
	void land();
	void take_off();
	
}