package com.edu.test;

import java.util.Arrays;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class PolyTest3 {

	public static void main(String[] args) {
		
		//Heterogeneous Collection
		Employee[ ] employees = {
				new Manager("James", 30000.0, new MyDate(1999, 1, 1), "IT"),
				new Engineer("Tomas", 45000.0, new MyDate(1997, 3, 12),"Java",100 ),
				new Secretary("Peter", 35000.0, new MyDate(2000, 4, 3),"James")								
		};
		//배열의 생성, 선언, 초기화 동시에
		
		/*
		  for문과 instanceof, Object Casting, Virtual Method Invocation 전부 다 사용
		  
		  James 부서를 "개발부" 로 수정
		  Tomas 기술을 "AI" 로 수정
		  Peter Boss의 이름을 "Gosling"로 수정
		  
		  수정된 정보를 출력...확인
		 */
		
		////////////////////////////////////////////////////
		
		/*
		 1step
		 updateManager(Manager m){}
		 updateEngineer(Engineer eg){}
		
		 2step
		 updateEmployee(Manager m){}
		 updateEmployee(Engineer eg){}
		
		
		 3step
		 updateEmployee(Employee e){
		 	if(e instanceof Manager){}
		 	if(e instanceof Engineer){}
		 }
		 */	
		
		
		for(Employee e : employees) {
			if(e instanceof Manager)
				((Manager) e).changeDept("개발부");
			if(e instanceof Engineer)
				((Engineer) e).changeTech("AI");
			if(e instanceof Secretary)
				((Secretary) e).changeNameOfBoss("Gosling");
			
			System.out.println(e.toString());
		}		
		
	}//main
}//class
