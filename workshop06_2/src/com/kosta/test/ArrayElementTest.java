package com.kosta.test;

import java.util.Arrays;

public class ArrayElementTest {

	public static void main(String[] args) {
		double[] salaries = {30000.0, 450000.0, 570000.0};
		System.out.println(salaries);
		System.out.println(salaries.toString());
		//주소값 출력됨
		
		//배열 안에 있는 여러 개의 값들을 출력할 때 사용하는 라이브러리
		//: Arrays.toString() - 배열 안에 있는 값을 문자열로 출력함
		System.out.println(Arrays.toString(salaries));
		//값 출력됨

	}

}
