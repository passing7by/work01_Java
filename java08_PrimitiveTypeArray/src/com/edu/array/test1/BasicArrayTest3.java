package com.edu.array.test1;
/*
 * 배열 : Same Data Type
 * 1) 선언
 * 2) 생성 --- 반드시 배열의 사이즈를 명시
 * 3) 초기화
 */
public class BasicArrayTest3 {

	public static void main(String[] args) {
		int [] scores = {95,78,66,90,87};
		//1. scores 객체 생성 2. 묵시적 초기화 3. 주소값 생성 4. 주소값 할당 5. 명시적 초기화 발생
		
		//향상된 for 문을 이용해서 성적들의 총합과 평균값을 각각 출력
		int sum = 0;
		for(int score : scores) sum += score;
		System.out.println("성적들의 총합"+sum);
		System.out.println("평균 성적"+sum/scores.length);	
	}

}
