package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Secretary extends Employee {
	private String nameOfBoss;

	public Secretary() {
		
	}
	//[자식 클래스의 생성자 첫 줄에 반드시 super(...) 를 호출해야 함
	//단, 기본 생성자( super() )인 경우 생략할 수 있음]

	public Secretary(String name, double salary, MyDate birthDate, String nameOfBoss) {
		super(name, salary, birthDate);
		this.nameOfBoss = nameOfBoss;
	}
	
	//추가
	public String getNameOfBoss() {
		return nameOfBoss;
	}

	public void changeNameOfBoss(String nameOfBoss) {
		this.nameOfBoss = nameOfBoss;
	}
	
	public String toString() {
		return super.toString()+"[nameOfBoss : "+nameOfBoss+"]";
	}

	
	
	

	
	
	
}
