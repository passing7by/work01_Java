package com.edu.vo;
/*
 * Progammer가 여러대의 NoteBook을 구매하기 위해서는
 * 반드시 필드에 NoteBook 타입이 아닌
 * NoteBook[] 선언되어져야 한다
 */
public class Programmer {
	//필드 선언	
	String name;
	String mainSkill;
	float salary;
	String adress;
	int bonus;

	///////////////Has a Relation/////////////
	NoteBook[] noteBooks; //배열 선언
	
	//생성자 주입
	public Programmer() {}
	public Programmer(String name, String mainSkill, float salary, String adress, int bonus) {
		this.name = name;
		this.mainSkill = mainSkill;
		this.salary = salary;
		this.adress = adress;
		this.bonus = bonus;
	}
	
	public Programmer(String name) {
		this.name = name;
	}
	
	public NoteBook[] getNoteBooks() {
		return noteBooks;
	}
	
	public void buyNoteBooks(NoteBook[] noteBooks) {
		this.noteBooks = noteBooks;
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
