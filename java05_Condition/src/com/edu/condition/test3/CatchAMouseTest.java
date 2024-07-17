package com.edu.condition.test3;

import java.util.Scanner;

public class CatchAMouseTest {
	
	public static String solv(int a, int b, int c) {
		/*
		 이 안에 로직 작성
		 */
		int n = a - c;
		int m = b - c;

		
		if(a == b) System.out.println("Mouse Escape!");
		else if(Math.abs(n)<Math.abs(m)) System.out.println("Cat A Catch");
		else if(Math.abs(n)>Math.abs(m)) System.out.println("Cat B Catch");

		return "";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int catA = sc.nextInt();
		int catB = sc.nextInt();
		int mouse = sc.nextInt();
		
		String result = solv(catA, catB, mouse);
		System.out.println(result);
	}

}
