package com.self.test;

import com.self.manager.BookManager;
import com.self.vo.Book;
import com.self.vo.Magazine;
import com.self.vo.Novel;

/**
 * <pre>
 * 
 * {@code
 *  장서를 관리하는 기능을 실행하는 클래스
 *  }
 *  
 *  </pre>
 *  
 *  @author 김지남
 *  @since 2024년 7월 9일
 */
public class BookManagerTest {

	/**
	 * 
	 * @param args 인수
	 */
	public static void main(String[] args) {

		//싱글톤
		BookManager service= BookManager.getInstance();
		
		//기능 1. 책의 권 수를 반환
		System.out.println("===== 전체 장서 수 =====");
		int num = service.getNumberOfBooks();
		System.out.println(num+"권");
		System.out.println("=====================");

		
		//기능 2. 새 책 추가
		service.insertBook(new Novel(1111, "그리고 아무도 없었다", "애거서크리스티", "민음사", 15000.0, "미스테리"));
		service.insertBook(new Magazine(2222, "리본", "김지남 외 공저", "지남출판", 10000.0, 7));
		service.insertBook(new Novel(3333, "온실 속 세상", "김초엽", "온실출판", 17000.0, "SF"));
		service.insertBook(new Magazine(4444, "월간낚시", "낚시꾼협회", "낚시출판", 7000.0, 6));


		
		//기능 3. 모든 책들의 정보를 반환
		System.out.println("\n===== 전체 책 검색 =====");
		Book[] books = service.getAllBook();
		for(Book b : books) {
			if(b == null) continue;
			else System.out.println(b.getDetails());
		}
		
		//기능 4. 책의 고유번호로 책 정보를 검색
		System.out.println("\n===== 책 검색 (고유번호) =====");
		Book b1 = service.searchBookByIsbn(1111);
		System.out.println(b1.getDetails());
		
		//기능 5. 책의 제목으로 책 정보를 검색
		System.out.println("\n===== 책 검색 (제목) =====");
		Book b2 = service.searchBookByTitle("리본");
		System.out.println(b2.getDetails());
		
		//기능 6. 책의 출판사로 책 정보를 검색
		System.out.println("\n===== 책 검색 (출판사) =====");
		Book b3 = service.searchBookByPublisher("낚시출판");
		System.out.println(b3.getDetails());
		
		//기능 7. 책의 가격으로 책 정보를 검색
		System.out.println("\n===== 책 검색 (가격) =====");
		Book[] books1 = service.searchBookByPrice(10000, 20000);
		for(Book b : books1) {
			if(b == null) continue;
			else System.out.println(b.getDetails());
		}
		
		//기능 8. 모든 책들의 가격에 대한 합계
		System.out.println("\n===== 장서 가격 합계 =====");
		Double d = service.getSumPriceOfBooks();
		System.out.println(d);
		
		//기능 9. 모든 책들의 가격에 대한 평균
		System.out.println("\n===== 장서 가격 평균 =====");
		Double d1 = service.getAvgPriceOfBooks();
		System.out.println(d1);



		




		
		
	}
}
