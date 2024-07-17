package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Manager extends Employee{

	/*
	 * public Manager() { super(); //부모 생성자 호출 } //자식이 만들어지기 위해서는 부모가 먼저 만들어져야 함
	 */	
	
	private String dept;
	
	public Manager() {
		
	}
	//[자식 클래스의 생성자 첫 줄에 반드시 super(...) 를 호출해야 함
	//단, 기본 생성자( super() )인 경우 생략할 수 있음]
	
	public Manager(String name, double salary, MyDate birthDate, String dept) {
		super(name, salary, birthDate); //부모는 슈퍼로 접근
		this.dept = dept; //자식은 디스로 접근
	}
	
	//추가
	public String getDept() {
		return dept;
	}

	public void changeDept(String dept) {
		this.dept = dept;
	}

	
	
	public String toString() {
		//부모가 물려준 기능을 자식에게 맞게 고쳐썼다 (구현부 변경=Method Overiding)
		return super.toString()+","+dept;
	}
	
	
	public void manage() {
		System.out.println("Manager...");
	}
}
