package com.edu.oop.test;

import com.edu.oop.NoteBook;

/*
생성자: 객체가 생성될 때마다 구동하는 
 */
public class NoteBookTest3 {

	public static void main(String[] args) {
		//객체 생성 코드
		NoteBook n = new NoteBook(); //생성자
		NoteBook n2 = new NoteBook(999,"삼성",2200000.0); //생성자

		System.out.println(n.getNoteBookInfo());
		System.out.println(n2.getNoteBookInfo());

	}

}
