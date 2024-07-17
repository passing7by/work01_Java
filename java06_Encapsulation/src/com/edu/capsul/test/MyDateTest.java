package com.edu.capsul.test;

import com.edu.capsul.MyDate;
import java.util.Scanner;

public class MyDateTest {

	public static void main(String[] args) {

		MyDate md = new MyDate();
		//md.month = 13;
		//md.day = 33;
		//필드에 직접 접근하게 됨
		
		//md.setMonth(13);
		//md.setDay(33);
		//0이 나오지 않도록 하기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월 입력");
		int month = sc.nextInt();
		md.setMonth(month); //**입력된 값을 넣는 세터 꼭 넣기
		
		System.out.println("날짜 입력");
		int day = sc.nextInt();
		md.setMonth(day); //**입력된 값을 넣는 세터 꼭 넣기

		System.out.println("Today is " + md.getMonth()+ "월 " + md.getDay()+ "일 입니다.");
		

	}

}
