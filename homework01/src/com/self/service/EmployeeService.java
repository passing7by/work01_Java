package com.self.service;

import com.self.util.MyDate;
import com.self.vo.Engineer;
import com.self.vo.Manager;

public class EmployeeService {
	Manager[ ] ms;
	//[Manager 클래스 타입의 배열 'ms' 선언]
	int midx;
	//[int 타입의 필드 'midx' 선언]
	
	Engineer[ ] egs;
	int egidx;	
	
	private static EmployeeService eps;
	//[이 클래스에서만 사용이 가능하면서(private), 객체를 생성하지 않고도 사용 가능한(static) 필드인,
	//EmployeeService 클래스 타입의 'eps' 필드 선언]
	
	private EmployeeService(int size){
		ms = new Manager[size];
		egs = new Engineer[size];
	}
	//[이 클래스에서만 호출 가능한(private) 생성자]
	//[Test 클래스에서 이 생성자를 호출한 결과:
	//입력값만큼의 길이를 가지는 두 개의 배열 생성 ]
	
	public static EmployeeService getInstance(int size) {
		eps = new EmployeeService(size);
		return eps;
	}
	//[다른 클래스에서도 사용이 가능하면서(public), 객체 생성 없이도 호출 가능한(static) 메소드,
	//EmployeeService 클래스 타입의 'eps' 객체를 생성하고 반환]

	//1. Manager를 추가하는 기능
	public void addManager(Manager m) {	
//		midx = 1;
//		ms[midx++] = m;	
		ms[midx++] = m;
	}
	//[1부터 시작하면 왜 안됨??]
	
	//1-1. 정보 확인
	public void printManagers() {
		for(Manager m : ms) {
			if(m == null) {
				System.out.println("null");
				continue;
			}
			else System.out.println(m.getDetails());
		}
	}
	//[위의 메소드에서 midx = 1;을 작성하는 경우, 이름이 DDD인 매니저만 인덱스 1에 들어가 출력되고, 나머지는 null로 출력됨]
	
	//2. Engineer를 추가하는 기능
	public void addEngineer(Engineer eg) {	
		egs[egidx++] = eg;
	}
	
	//2-1. 정보 확인
	public void printEngineers() {
		for(Engineer eg : egs) {
			if(eg == null) {
				System.out.println("null");
				continue;
			}
			else System.out.println(eg.getDetails());
		}
	}
	
	//3. Manager를 삭제하는 기능
	public void deleteManager(String name) {
		for(int i=0; i<midx; i++) {
			if(ms[i].getName().equals(name)) {
				for(int j = i; j<midx; j++) {
					ms[j] = ms[j+1];
				}
				ms[midx] = null;
				//[1번 메소드에서 증가시켰던 인덱스의 값을 null로 처리]
				//[=> 1번 메소드에서 마지막으로 값을 주입했던 칸의 값이 null이 됨]
				
				midx--;
				//[인덱스를 1 줄임]
				//[인덱스 = 기본값이 아닌, 주입한 값이 있는 칸의 수]
				//[ms[midx]가 기본값이 되었기 때문에, 기본값이 된 만큼 숫자를 줄인 것임]
				
				System.out.println("Outter break");
				break;
				//[바깥쪽 for문을 빠져나옴]
			}
		}
	}
	
	//4. Engineer를 삭제하는 기능
	public void deleteEngineer(String name) {
		for(int i =0; i<egidx; i++) {
			if(egs[i].getName().equals(name)) {
				for(int j = i; j<egidx; j++) {
					egs[j] = egs[j+1];
				}
				egs[egidx] = null;
				//[배열의 마지막 값을 null로 처리]
				
				egidx--;
				//[배열의 길이를 1 줄임]
				
				break;
				//[맨 바깥쪽 for문을 빠져나옴]
			}
		}
	}
	
	//5. Manager의 정보를 수정하는 기능
	public void updateManager(Double salary, String dept, int deptno, String name) {	
		
		for(Manager manager : ms) {
			if(manager==null) continue;
			if(manager.getName().equals(name)) {
				manager.setSalary(salary);
				manager.setDept(dept);
				manager.setDeptno(deptno);
			}
		}
	}
	
	//6. Engineer의 정보를 수정하는 기능
	public void updateEngineer(Engineer eg) {	
		
		for(Engineer engineer : egs) {
			if(engineer==null) continue;
			if(engineer.getName().equals(eg.getName())) {
				engineer.setSalary(eg.getSalary());
				engineer.setTech(eg.getTech());
				engineer.setBonus(eg.getBonus());
			}
		}
	}
	
	//Method Overloading
	/*
	 * 하는일은 똑같은데...처리하는 데이타를 달리할때 쓰는 기법
	 * 메소드의 통일감을 강조하면서도 서로다른 데이타를 처리할수 있게끔 해준다.
	 */
	
	//7. 이름으로 매니저를 검색하는 기능
	public Manager findManager(String name) {
		Manager m = null;

		for(Manager manager : ms) {
			if(manager == null)continue;
			if(manager.getName().equals(name))
				m = manager;
		}		
		return m;
	}
	
	//8. 부서번호로 매니저를 검색하는 기능
	public Manager[ ] findManager(int deptno) {
		int size = 0;
		for(Manager m : ms) {
			if(m == null) break;
			else if(m.getDeptno() == deptno) size++;
			//else if를 실행한 뒤 size를 1 증가시킴 -> else if를 실행한 횟수 == size
		}
		
		Manager[ ] temp = new Manager[size];
		int i = 0;
		for(i=0; i<size; i++) {
			if(ms[i].getDeptno() == deptno) {
				temp[--size] = ms[i];
				//size를 1 감소시킨 뒤 if를 실행함
				//ex. size = 2라면, temp[1] = ms[0], temp[0] = ms[1]
				}
		}
		return temp;	
	}

	
	//9. 이름으로 엔지니어를 검색하는 기능
	public Engineer findEngineer(String name) {
		Engineer eg = null;

		for(Engineer engineer : egs) {
			if(engineer == null)continue;
			if(engineer.getName().equals(name))
				eg = engineer;
		}		
		return eg;
	}
	
	//새 기능 추가 1. Manager의 평균 임금을 구하는 기능
	public Double avgManager() {
		Double sum = 0.0;
		Double avg = 0.0;
		int size = 0;
		for(Manager m : ms) {
			if(m == null) break;
			else {
			sum += sum + m.getSalary();
			size++;
			}
		}
		avg = sum/size;
		
		return avg;	
	}
	
	//새 기능 추가 2. Manager 인턴 사원 등록
	public void addManager(String name, MyDate birthDate, Double salary) {
		Manager m = new Manager(name, birthDate, salary);
		ms[midx++] = m;
	}
}
	

