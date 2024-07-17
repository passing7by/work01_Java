package com.edu.loop.test;

public class LoopingContinueTest3 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) continue;
			//만약 i가 짝수면 멈췄다가(다음줄의 실행을 하지 않고) 다음 값부터 계속 시작해라
			//(조건에 해당하는 구간은 건너뛰면서 반복은 계속 해라)
			sum += i;
		}
		
		System.out.printf("1부터 100까지의 홀수값 총합은 %d", sum);
		
	}

}
