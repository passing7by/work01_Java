package com.edu.array.test1;
/*
 * 배열 : Same Data Type
 * 1) 선언
 * 2) 생성 --- 반드시 배열의 사이즈를 명시
 * 3) 초기화
 */
public class BasicArrayTest1 {

	public static void main(String[] args) {
		// 1) 선언
		int[] arr; //*변수 타입과 배열이름 선언, <변수타입[] 배열이름;>
		// 2) 생성
		arr = new int[3];// 3칸 짜리 배열을 만들었다. *<배열이름 = new 변수타입[배열크기];>
		System.out.println("배열 Container 주소값 :: " + arr);//*배열의 주소값 출력
		System.out.println("\n================배열 안의 각각의 요소==========================");
		for (int i = 0; i < 3; i++) //*int타입의 i라는 변수는 0부터 시작하며, 3을 넘지 않을 때까지 반복할 거고, i는 1씩 증가할거임
			System.out.println(arr[i] + ""); //*arr라는 배열 안의 i라는 번호가 붙은 값을 출력
		// 3)초기화
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		System.out.println("\n================배열 안의 각각의 요소==========================");
		for (int i = 0; i < 3; i++)
			//array는 class가 제공되지 않는 유일한 객체로 array는 legth로 사이즈를 알 수 있다.
			System.out.println(arr[i] + "");
	}

}
