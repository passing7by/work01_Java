package com.edu.condition.test3;

import java.util.Scanner;

public class Pattern369Test {

	public static void solv(int number) {
		//코드 구현
		int m1 = number % 10;
		int m2 = number / 10;
		
		if(m1%3==0 && m2%3==0) System.out.println("@@");
		else if(m1%3==0 || m2%3==0) System.out.println("@");
		else System.out.println("결과 없음");
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리 숫자 입력 >>");
		int n =sc.nextInt();
		
		solv(n);
	}

}

