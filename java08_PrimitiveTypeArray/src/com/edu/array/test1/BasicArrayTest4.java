package com.edu.array.test1;
import java.util.Scanner;
/*
 * Scanner를 사용해서 맨 처음 입력받는 값으로 배열의 크기를 받아오기
 * int size = sc.nextInt();
 */
public class BasicArrayTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열의 사이즈 입력 >>>");
		int size = sc.nextInt();
		
		System.out.println("String 타입의 배열 생성");
		String[] names = new String[size];
		
		System.out.println("String 타입의 배열 초기화");
		System.out.println("\n이름들을 출력");
		for(int i=0; i<names.length; i++) {
			names[i] = sc.next();
			
			
		}
		for(String name : names) System.out.println(name +"");
	}
}