package com.edu.oop.test;

import com.edu.oop.Movie3;

public class Movie3TestDrive {

	public static void main(String[] args) {
		Movie3 a = new Movie3(); 
		
		System.out.println(a.getMovie3Info());
		
		Movie3 b = new Movie3();
		
		System.out.println(b.getMovie3Info());
		
		Movie3 c = new Movie3();
		
		System.out.println(c.getMovie3Info());
		
	} 

} //Movie3 클래스에 기본 생성자 넣지 않을 경우 오류남 (명시적 생성자가 하나라도 있을 경우, 컴파일러가 기본 생성자를 넣어주지 않음)
