package com.edu.loop.test;
/*
 * for | while | do while
 * for(초기식 ; 조건식(언제까지 반복할건지, boolean으로) ; 증감식)
 * 브레이크
 * 컨티뉴
 */
public class BasicLoopingTest1 {

	public static void main(String[] args) {
		
		System.out.println("=============for===========\n");
		for(int i=0; i<10; i++)
			System.out.println("Hello for Loopong   "+i);
		
		System.out.println("=============while===========\n");
		int i=10;
		while(i>0) {
			System.out.println("Hello while Loopong   "+i);
			i--;
		}
			
		System.out.println("=============do while===========\n");
		int j=10;
		do {
			System.out.println("Hello do while Loopong   "+i);
			j++;
		}while(j<10);
		
	}


}
