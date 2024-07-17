package com.edu.oop.test;

import com.edu.oop.NoteBook;

/*
 1. NoteBook에 객체생성
 == NoteBook의 멤버(4)를 메모리에 올린다
 2.
 필드 --> 값할당
 메소드 --> 호출
 */
public class NoteBookTest {

	public static void main(String[] args) {
		//객체 생성 코드
		NoteBook n;
		n = new NoteBook();
		//여기서 이미 객체 생성됨. 값이 아직 안 들어갔는데?->기본값으로 채워짐(묵시적 초기화)
		//그리고 기본값이 채워지는 순간 주소값이 할당됨 & stack에 있는 n에 주소값이 채워짐(n은 참조변수이자 인스턴스변수)
		
		n.serialNumber = 111;
		n.brand = "LG gram";
		n.price = 1700000.0;
		//n이 참조하고 있는 주소 안의 필드에 값 할당(기본값이 할당한 값으로 덮어씌워짐 ->명시적 초기화)
				
		n.printNoteBookInfo();
		System.out.println(n);
		//////////////////////
		
		
		NoteBook m = new NoteBook();
		
		m.serialNumber = 222;
		m.brand = "Samsung";
		m.price = 1350000.0;
		
		m.printNoteBookInfo();
		System.out.println(m);
	}

}
