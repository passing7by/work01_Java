package com.edu.oop.test;

import com.edu.oop.NoteBook;

/*
필드에 직접 값을 할당하지 않고
기능을 호출해서 필드초기화를 구동
 */
public class NoteBookTest2 {

	public static void main(String[] args) {
		//객체 생성 코드
		NoteBook n = new NoteBook();
		n.setNoteBookField(123, "LG gram", 1700000.0);
		
		//n.print
		System.out.println(n.getNoteBookInfo());
	}

}
