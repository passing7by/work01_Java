package com.edu.condition.test1;
/*
 조건문
 ::
 if(조건 A) / else if(조건 B), else if(조건 C)... / else(나머지 모든 경우)
 
 if(조건 A) {
 	  //조건이 맞으면(참이면) 이 부분이 실행됨 => 실행은 반드시 한 번만 가능!!! (조건이 맞는지 아닌지는 여러번 체크될 수 있음)
 	   * 괄호 안의 조건문에는 "="를 넣을 수 없음(할당이기 때문 - "=" 기호는 자바에서 "할당"을 의미함)
 	   * 따라서, "=="(같다라는 의미 = "==" 기호는 자바에서 "같다"를 의미함)
 } else if(조건 B) {
	  //조건이 맞으면 이 부분이 실행됨   
 } else if(조건 C) {
	  //조건이 맞으면 이 부분이 실행됨 
 } else {
	  //조건이 맞으면 이 부분이 실행됨   
 }
 */
public class GradeIfTest1 {

	public static void main(String[] args) {
		
		int grade = 88; // 로컬 밸류는 기본값이 없기 때문에반드시 초기화 해야 함. 88은 리터럴 밸류
		
		if(grade >= 90 & grade <= 100) {
			System.out.println("A grade");
		}else if(grade >= 80 & grade < 90) {
			System.out.println("B grade");
		}else if(grade >= 70 & grade < 80) {
			System.out.println("C grade");
		}else {                               //else에는 조건을 삽입하지 않으므로, else 뒤에 ()를 삽입하지 않음
			System.out.println("Try Again");
		}
	}
}
