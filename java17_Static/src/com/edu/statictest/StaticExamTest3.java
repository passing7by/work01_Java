package com.edu.statictest;
/*
 * main이 실행 -->
 * 객체 생성 == 필드 초기화
 */
public class StaticExamTest3 {
	
	static int i; //public class StaticExamTest3가 갖는 static 변수 선언
	
	public static void main(String[] args) { //JVM이 가장 먼저 읽는 함수: main - 하는 일: 1.객체 생성 2.함수 호출
		System.out.println("1. main method block......" + i);
	}//main
	
	//static initialization block (static 초기화 블락) - 본격적인 초기화가 진행되기 전에 미리 값으로 들어가 있음 
	//(main보다 더 광범위한(global한) 초기화, ready on 상태, 음식점에 가서 음식이 나오기 전에 수저가 놓아지는 것)
	static {
		i = 300;
		System.out.println("2. static block......" + i);
	}//static
	
}//class