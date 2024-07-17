package com.edu.vo;
/*
 Notebook의 정보를 저장하고 있는 클래스
 */
public class NoteBook {
	//field 선언
	public int serialNumber;
	public String brand;
	public double price;
	
	public NoteBook() {} //기본 생성자
	
	public NoteBook(int serialNumber, String brand, double price) { //명시적 생성자(필드 초기화 수행)
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.price = price;
	}

	//기능 추가 (필드에 값을 할당, 주입, setter, inject)
	/*
	 필드와 지역변수의 이름이 똑같을 때, 이 둘을 구분하기 위해서 필드 앞에 this를 지정함
	 this는 해당 객체의 레퍼런스(주소값)를 참조하고 있음
	 */
	public void setNoteBookField(int serialNumber, String brand, double price) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.price = price;
	}
	
	//기능 추가 (필드에 주입된 값을 받아옴, getter, reading)
	public String getNoteBookInfo() {
		return serialNumber + "," + brand + "," + price; //String과 논스트링이 결합되면 무조건 String으로 나옴 (숫자+문자=문자)
	}
	
	//method 정의 (선언+구현부)
	//void: 반환타입 - 해당 기능을 수행할 시 반환되는 데이타가 없다는 의미의 반환타입
	public void printNoteBookInfo() {
		System.out.println(serialNumber+","+brand+","+price);
	}

}
