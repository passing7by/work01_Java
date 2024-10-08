package com.edu.parent;

import com.edu.util.MyDate;

//부모 클래스
public class Employee {

		private String name;
		private double salary;
		private MyDate birthDate;
		
		public Employee() {}
		public Employee(String name, double salary, MyDate birthDate) {
			super();
			this.name = name;
			this.salary = salary;
			this.birthDate = birthDate;
		}
		
		
		
		
		
		public String toString() {
			return name+","+salary+","+birthDate.getDate();
		}
		
		//추가
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public MyDate getBirthDate() {
			return birthDate;
		}
		public void setBirthDate(MyDate birthDate) {
			this.birthDate = birthDate;
		}
		
		
}
