package com.edu.array.test;

import com.edu.vo.NoteBook;
import com.edu.vo.Programmer;
/*
 * Bob의 설계...
 */
public class TonnysArrayTest3 {

	public static void main(String[] args) {
		
		NoteBook[] noteBooks = { //*변수타입(클래스)[] 배열이름 선언
				new NoteBook(111, "HP", 150), //*new 변수타입(변수에 대입할 값)
				new NoteBook(222, "LG Gram", 170),
				new NoteBook(333, "SAMSUNG", 200)
		};
		//*NoteBook이라는 타입의 배열 선언, 생성 초기화 완료
		
		Programmer bob = new Programmer("Bob"); //*변수타입 변수이름 = new 변수타입(변수에 대입할 값)
		//*Programmer 객체를 생성, 변수 이름은 bob, 필드는 Bob
		
		bob.buyNoteBooks(noteBooks); //NoteBook[]
		//*bob이라는 변수에 notebooks 배열의 값을 대입
		
		System.out.println("Bob's NoteBook");
		
		NoteBook[] returns = bob.getNoteBooks();
		//*
		
		for(NoteBook nb : returns)
			nb.printNoteBookInfo();
	}

}
