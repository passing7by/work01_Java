/*
 * step1
 * void addEngineer(Enginner e) {}
 * void insertSalesMan(S) {}
 * void registerAnalysis(A) {}
 * 
 * step2
 * void addEnginner(Enginner e) {}
 * void addSalesMan(SalesMan s) {}
 * void addAnalysist(Analysist a) {}
 * 
 * step3
 * void addEmployee(Enginner e) {}
 * void addEmployee(SalesMan s) {}
 * void addEmployee(Analysist a) {}
 * 
 * step4
 * void addEmployee(Employee e) {}
 */

package com.edu.service;

import com.edu.vo.Engineer;
import com.edu.vo.SalesMan;

/*
 * Enginner, SalesMan 각각의 직원들을 핸들링하는 기능만으로 구성된 서비스 클래스...
 */
public class HRService {

	Engineer[] engineers; //*배열 선언
	int eidx;
	
	SalesMan[] salesMans; //*배열 선언
	int sidx;
	
	public HRService(int size) { //생성자 액세스 -> 클래스 액세스를 따라감
		engineers = new Engineer[size]; //*배열 생성
		salesMans = new SalesMan[size]; //*배열 생성
	}//*로컬 레벨이 아닌 필드 레벨로 핸들링하기 위해 생성하는 것. 메소드 안에 로컬 레벨로 핸들링하면 메소드 실행이 끝난 후 날아가버림
	
	//서비스 기능들을 정의.... 1) 선언부 먼저 작성 2) 나중에 구현부 작성 +Test에서 하나씩 호출
	
	// 엔지니어를 추가하는 기능
	public void addEmployee(Engineer e) {
		//engineers[eidx++] = e;
		if(eidx == engineers.length)
			System.out.println("엔지니어 등록이 불가능합니다.");
		else {
			engineers[eidx++] = e;
			System.out.println(e.getName() + " 엔지니어 등록 성공");
		}
	}
	// 영업사원을 추가하는 기능
	public void addEmployee(SalesMan s) {
		if(sidx == salesMans.length)
			System.out.println("영업사원 등록이 불가능합니다.");
		else {
			salesMans[sidx++] = s;
			System.out.println(s.getName() + " 영업사원 등록 성공");
		}
	}
	// 엔지니어의 정보를 수정하는 기능
	public void updateEmployee(Engineer e) {
		for(Engineer engineer : engineers) {
			if(engineer==null) continue;
			if(engineer.getName().equals(e.getName())) { //수정할 대상이 현재 존재한다면
				engineer.changeSalary(e.getSalary());
				engineer.developMainSkill(e.getMainSkill());
			}
		}
	}
	// 영업사원의 정보를 수정하는 기능
	public void updateEmployee(SalesMan s) {
		for(SalesMan salesman : salesMans) {
			if(salesman==null) continue;
			if(salesman.getName().equals(s.getName())) { //수정할 대상이 현재 존재한다면
				salesman.changeSalary(s.getSalary());
				salesman.setCommition(s.getCommition());
			}
		}
	}
	// 특정한 엔지니어를 검색하는 기능...이름으로
	public Engineer searchEmployee(String name) {
		Engineer engineer = null;
		for(Engineer e : engineers) {
			if(e==null)continue;
			if(e.getName().equals(name))
				engineer=e;
		}		
		return engineer;
	}
	
	//정보를 출력하는 기능을 추가
	public void printEngineer() {
		for(Engineer e : engineers) {
			if(e==null) break;
			System.out.println(e.getDetails());
		}
	}
			
	
	public void printSalesMan() {
		for(SalesMan s : salesMans) {
			if(s==null)break;
			System.out.println(s.getDetails());
		}
			
	}
	
}
