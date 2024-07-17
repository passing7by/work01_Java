package com.edu.condition.test1;
/*
GradeIfTest1 코드는 컴파일 시점에 실제값 88이 입력되는 코드임. 따라서 프로그램이 아님
실행 시점에 값이 입력되도록 스캐너를 생성해서 값을 입력받아보려고 함

학생이름 / 해당 학생의 점수 를 입력
조건을 그대로 작성
하승현 , C Grade >> 이런 식으로 출력되도록 로직 추가
 */

import java.util.Scanner;

public class GradeIfTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //스캐너 객체 생성
		System.out.println("당신의 이름과 성적을 입력하세요");
		
		String name = sc.next();
		int grade = sc.nextInt();
		
		if(grade >= 90 & grade <= 100) {
			System.out.println(name + " A grade");
		}else if(grade >= 80 & grade < 90) {
			System.out.println(name + " B grade");
		}else if(grade >= 70 & grade < 80) {
			System.out.println(name + " C grade");
		}else {
			System.out.println(name + " Try Again");
		}
		
	}
	
}
