package com.edu.statictest;
/*
 * static 키워드 특징
 * 1. static한 성질의 멤버는 객체 생성 과정 없이 메모리에 올라감
 * 2. compile   |   runtime(v)
 *    static한 성질의 멤버는 class file loader 단계에서 미리 메모리에 올라감
 * 3. 클래스이름.static멤버
 *    System.out
 *    System.in
 *    Integer.parseInt()
 *    EmployeeService.getInstance()
 *    Math.random()
 *    main()
 * 4[중요]. static한 멤버는 생성된 객체들이 다 공유하는 성질의 것이다!!!!!!!!  
 * 5. Member Level에서 사용됨 | Local Level 에서는 사용 못함
 * 6. static은 static끼리 통함
 */

class Member{
	int ssn = 1234;
	static String name = "길동"; //
	static int age = 19;
	
	public static void memberInfo() {
//		System.out.println("우/유/빛/깔 "+name+","+ssn);
		//static은 끼리끼리 통한다 (메모리에 올라가는 시점이 다른 성질의 변수와 다름, ssn은 객체 생성 후 사용해야 함)
		//[6. static은 static끼리 통함]
	}
}//class Member

public class StaticExamTest1 {

	public static void main(String[] args) {
//		static int count = 0;
		//로컬 레벨에서 사용 불가
		//[5. Member Level에서 사용됨 | Local Level 에서는 사용 못함]
		
		Member m = new Member();
//		System.out.println(Member.name);
//		Member.memberInfo();
		
		System.out.println(m.name);
		//[객체 m에 있는 name 값을 출력 -> 객체 생성시 값을 안 넣었는데도 값이 출력됨]
		//[1. static한 성질의 멤버는 객체 생성 과정 없이 메모리에 올라감]
		m.memberInfo();

	}//main
}//public class StaticExamTest1
