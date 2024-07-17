package com.edu.condition.test3;

public class OperatorTest1 {

	public static void main(String[] args) {
		
		int i = 5;
		int j = 3;
		
		// % --> 모듈러스(mod): 나머지
		System.out.println("연산자 % : " + i % j); //2
		// / --> 몫
		System.out.println("연산자 / : " + i / j); //1

		
		/*
		 98
		 두자리수
		 십의 자리: 9
		 일의 자리: 8
		 */
		int num = 98;
		System.out.println("연산자 % : " + num % 10); //9
		System.out.println("연산자 / : " + num / 10); //8
		
		int k = 10;
		//1씩 증가시킬 때, "++", 1씩 감소시킬 때, "--"
		System.out.println(k++); //10 - 처음에는 증가시키기 전 현재값 표시
		System.out.println(k++); //11 - 뒤에 라인이 추가될 때마다 1씩 증가
		
		int m = 10;
		//1씩 증가시킬 때, "++", 1씩 감소시킬 때, "--"
		System.out.println(++m); //11 = 1 증가한 다음에 값을 더함
		System.out.println(m); 
		
		
		//////////////same///////////////
		
		Operator1 o1 = new Operator1(); //o1는 참조변수(객체를 가리키는 주소값이 들어 있음)
		Operator1 o2 = new Operator1(); //o1와 o1는 다른 주소를 가지고 있음 (다른 객체이기 때문)
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1 == o2); // "=="는 "같다"를 의미
		System.out.println(o1 != o2); // "!="는 "같지않다"를 의미
		
		//////////////short circuit//////////
		/*
		 * System.out.println(o1.test1() | o2.test2()); //true
		 * System.out.println("##############"); System.out.println(o1.test1() &
		 * o2.test2()); //false System.out.println("##############");
		 * System.out.println(o1.test1());
		 */
		
		
		System.out.println("=============");
		System.out.println(o1.test1() || o2.test2()); //true & short circuit
		System.out.println("####################"); //true & short circuit
		System.out.println(o1.test1() && o2.test2()); //false & short circuit --> 앞의 값이 false일 때, 이미 뒤를 더 살펴볼 필요도 없이 false이므로 뒤를 더 보지 않음
		
		//equels()    ==
		System.out.println("==================Operator1 equals()============");

		System.out.println(o1.equals(o2)); //false
		System.out.println(o1 == o2);
		String msg1 = "Hello";
		String msg2 = "Hello";
		System.out.println("==================String equals()============");
		System.out.println(msg1.equals(msg2));
		//equals 함수는 원래 값(주소값) 비교가 되는데, String 비교할 때는 문자열 비교로 바뀌어져서 쓰임. --> 문자열 비교시에는 "==" 쓸 수 없음
		
		System.out.println("============&& & Test============");
		System.out.println(o2.test2() && o1.test1()); //test2 확인 후 false 도출
		System.out.println(o2.test2() & o1.test1()); //test1까지 확인 후 false 도출 



	}

}//class

class Operator1{
	
	public boolean test1() {
		System.out.println("test1() calling......");
		return true;
		
	}
	
	public boolean test2() {
		System.out.println("test2() calling......");
		return false;
		
	}
}//class

class Operator2{
	
	public boolean test1() {
		System.out.println("test1() calling......");
		return true;
		
	}
	
	public boolean test2() {
		System.out.println("test2() calling......");
		return false;
		
	}
}//class

