package com.edu.vo;

public class Programmer {
	//필드 선언	
	String name;
	String mainSkill;
	float salary;
	String adress;
	int bonus;

	///////////////Has a Relation/////////////
	NoteBook noteBook; //클래스 선언
	
	//생성자 주입
	public Programmer() {}
	public Programmer(String name, String mainSkill, float salary, String adress, int bonus) {
		this.name = name;
		this.mainSkill = mainSkill;
		this.salary = salary;
		this.adress = adress;
		this.bonus = bonus;
	}
	
	public void setNoteBook(NoteBook noteBook) {
		this.noteBook = noteBook;
	}
	
	public NoteBook getNoteBook() {
		return noteBook;
	}
	
	public String getNoteBookInfo() {
		return name + ","+ mainSkill + ","+ salary;
	}

	//기능 추가
	//개발자의 연봉을 리턴하는 기능
	public float getAnnualSalary() {
		return salary * 12 + bonus;
	}

		
	//개발자의 급여를 기존보다 50만원 더 인상하는 급여
	public void raiseSalary(int amount) {
		salary += amount;
	}	
}
