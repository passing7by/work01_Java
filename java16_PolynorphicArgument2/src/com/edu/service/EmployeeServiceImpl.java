package com.edu.service;

import com.edu.vo.Employee;

//인터페이스는 abstract template 기능만으로 구성된 클래스
public interface EmployeeServiceImpl implements EmployeeService{
	Employee[ ] getAllEmployee(Employee[ ] ea);
	Employee findEmployee(Employee[ ] ea, int empId);
	Employee[ ] findEmployee(Employee[ ] ea, String addr);
	int getAnnualSalary(Employee e);
	int getTotalCost(Employee[ ] ea);
}
