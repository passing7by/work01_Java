package com.edu.loop.test;
/*
 * 1. 반복문을 이용해서 1~100까지의 총합을 구하는 로직을 작성
 * 2. 반복문 안에서 조건을 하나 추가
 *  sum이 500을 넘으면 반복을 멈추고 빠져나가도록...그리고 그때의 총합을 출력하는 것으로
 * 
 */
public class LoopingBreakTest2 {

	public static void main(String[] args) {
		int sum = 0; //for 바깥
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum>500) break;
			//반복문에서 브레이크 키는 조건문에 작성, 브레이크 키가 작동하면 아예 반복문을 빠져나감
			
		}
		System.out.println("총합 : "+sum);

	}

}
