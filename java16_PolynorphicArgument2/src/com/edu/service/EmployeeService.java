package com.edu.service;

import com.edu.vo.Employee;
import com.edu.vo.Engineer;

public class EmployeeService {
	
	static private EmployeeService service = new EmployeeService();//1
	private EmployeeService() {}//2
	public static EmployeeService getInstance() { //3
		return service;
	}
	
	
		
	//1. 모든 Employee[ ]안에 들어있는 객체 정보들을 출력
	public Employee[ ] getAllEmployee(Employee[ ] ea){	
		Employee[ ] temp = new Employee[ea.length];
		int count = 0;
		for(Employee e : ea)temp[count++] = e;			
		
		return temp;
	}
	
	//2.테스트 클래스에서 넘겨받은 empId의 값과 일치하는 객체를 리턴하는 기능
	public Employee findEmployee(Employee[ ] ea, int empId){
		/*
		 * 	//메소드 오버로딩: 하는 일은 같지만, 처리하는 데이터는 달리 할 때 쓰는 기법
		 * //하는 일이 같다 = 메소드 이름이 동일하다, 처리하는 데이터가 다르다 = 인자값이 다르다
		 * 메소드 이름은 반드시 같아야 함
		 * 인자값은 반드시 달라야 함(순서, 갯수, 타입 중 하나라도)
		 * 리턴타입은 상관 없음
		 */
		Employee employee = null;
		for(Employee e : ea) {
			if(e.getEmpId() == empId) {
				employee = e;
				break; //break; : if 안에서 작성됨, 반복을 끝내고 반복문을 빠져나감
			}
		}
		
		return employee;		
	}
	
	//3. 테스트 클래스에서 넘겨받은  addr값과 일치하는 Employee 타입의 객체를 리턴받음

	public Employee[ ] findEmployee(Employee[ ] ea, String addr){
		//동일한 주소에 거주하는 사원의 명수...이걸 가지고 배열 생성
		int size = 0;
		for(Employee e : ea) {
			if(e.getAddr().equals(addr)) size++;
		}
		
		Employee[] addrEmps = new Employee[size];
		for(Employee e : ea) { //'e'는 for문 안에서만 존재함
			if(e.getAddr().equals(addr)) addrEmps[--size] = e;
		}
		return addrEmps;
	}
	
	//4. 특정한 Employee의 연봉을 리턴하는 기능...Engineer일때는 보너스 까지 생각
	public int getAnnualSalary(Employee e){
		int annualSalary = 0;
		annualSalary = e.getSalary()*12;
		if(e instanceof Employee) annualSalary += ((Engineer)e).getBonus();
		
		System.out.println(e);
		return annualSalary;
	}
	
	//5. 연간 총 인건비의 총액을 리턴하는 기능
	public int getTotalCost(Employee[ ] ea){
		int totalCost = 0;
		for(Employee e : ea) totalCost+=getAnnualSalary(e);
		
		return totalCost;
		
	}
	
}





































