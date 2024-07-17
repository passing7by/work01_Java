package com.edu.vo.test;
/*
 * 1. 객체생성
 * 2. 메소드 호출 
 */
import com.edu.vo.Programmer;
import com.edu.vo.NoteBook;

public class ProgrammerTest {

	public static void main(String[] args) {
		/*
		 * 1. james 라는 개발자 생성
		 *    tomas 라는 개발자 생성
		 * 2. j가 HP 노트북 구매
		 *    t가 LG 노트북 구매
		 * 3. t가 구매한 노트북의 가격과 브랜드명 출력
		 * 4. j의 연봉 출력
		 * 5. t의 급여를 인상하여 최종적인 연봉 출력  
		 */
		Programmer james = new Programmer("james", "sleep", 200.0F, "Seoul", 20);
		Programmer tomas = new Programmer("tomas", "run", 230.0F, "Daegu", 30);

		james.setNoteBook(new NoteBook(0, "HP", 0));
		tomas.setNoteBook(new NoteBook(0, "LG", 0));
		
		System.out.println("==== Tomas가 구입한 노트북 정보입니다 ====");
		NoteBook tomasNoteBook = tomas.getNoteBook();
		System.out.println(tomasNoteBook.getNoteBookInfo());
		
		System.out.println("\n==== ames의 연봉 정보입니다 ====");
		System.out.println(james.getAnnualSalary());
		
		System.out.println("\n==== Tomas의 급여 인상분을 포함한 연봉 정보입니다 ====");
		tomas.raiseSalary(50);
		System.out.println(tomas.getAnnualSalary());
	}

}
