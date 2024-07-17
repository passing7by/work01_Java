package com.edu.condition.test2;
/*
 staric한 기능을 가지고 있는
 Math 클래스의 메소드 random() 을 사용할 것음
 */
public class DiceIfTest1 {

	public static void main(String[] args) {
		//num이라는 변수에 1~6 사이의 임의의 값이 할당되도록 로직을 작성
		int num = (int) (Math.random()*6+1);
		
		if(num==1) System.out.println("Dice 1"); 
		if(num==2) System.out.println("Dice 2");
		if(num==3) System.out.println("Dice 3");
		if(num==4) System.out.println("Dice 4");
		if(num==5) System.out.println("Dice 5");
		if(num==6) System.out.println("Dice 6");
		/*
		 조건과 실행문이 한 문장일 경우, {} 생략 가능
		 if문을 사용한다고 해서 반드시 위에 if else와 else 를 쓸 필요 없음 (상황에 따라서 작성)
		 */
	}
	
}
