package com.self.manager;

import com.self.vo.Book;
/**
 * <pre>
 * 
 * {@code
 *  장서를 관리하는 기능을 저장하는 클래스
 *  }
 *  
 *  </pre>
 *  
 *  @author 김지남
 *  @since 2024년 7월 9일
 */
public class BookManager {
	/**
	 * 보유 가능한 최대 장서 수
	 */
	private static final int MAX_BOOKS = 10;
	/**
	 * 보유 중인 장서 목록
	 */
	private Book[] bs;
	/**
	 * 보유 중인 장서 수
	 */
	private int currentBs;
	
	/**
	 * BookManager 싱글톤 객체 선언, 생성
	 */
	static private BookManager service = new BookManager();//1
	/**
	 * BookManager 싱글톤 객체에 생성자로 필드 주입
	 */
	private BookManager() {
		bs = new Book[MAX_BOOKS];
		currentBs = 0;
	}//2
	//직원들이 들어있는 컨테이너가 아닌 빈 컨테이너 주입
	
	/**
	 * 
	 * @return service BookManager 싱글톤 객체
	 */
	public static BookManager getInstance() { //3
		return service;
	}
	
	//기능 1. 책의 권 수를 반환
	
	/**
	 * 
	 * @return currentBs 보유 장서 수
	 */
	public int getNumberOfBooks() {
		return currentBs;
	}
	
	//기능 2. 새 책 추가
	
	/**
	 * 
	 * @param b 새로 추가된 책
	 */
	public void insertBook(Book b) {
		if(currentBs < MAX_BOOKS)
			bs[currentBs++] = b;
		System.out.println("새로운 책 정보가 입력되었습니다!");
	}
	
	//기능 3. 모든 책들의 정보를 반환
	
	/**
	 * 
	 * @return 보유 장서 목록
	 */
	public Book[] getAllBook() {
		return bs;
	}
	
	//기능 4. 책의 고유번호로 책 정보를 검색
	
	/**
	 * 
	 * @param i 고유번호
	 * @return 입력한 고유번호를 가진 책
	 */
	public Book searchBookByIsbn(int i) {
		for(Book b : bs) {
			if(b == null)continue;
			if(b.getIsbn() == i) {
				return b;
			}
		}
		return null;
	}
	
	//기능 5. 책의 제목으로 책 정보를 검색
	
	/**
	 * 
	 * @param t 제목
	 * @return 입력한 제목의 책
	 */
	public Book searchBookByTitle(String t) {
		for(Book b : bs) {
			if(b == null)continue;
			if(b.getTitle().equals(t)) {
				return b;
			}
		}
		return null;
	}
	
	//기능 6. 책의 출판사로 책 정보를 검색
	
	/**
	 * 
	 * @param p 출판사
	 * @return 입력한 출판사의 책
	 */
	public Book searchBookByPublisher(String p) {
		for(Book b : bs) {
			if(b == null)continue;
			if(b.getPublisher().equals(p)) {
				return b;
			}
		}
		return null;
	}
	
	//기능 7. 책의 가격으로 책들의 정보를 검색
	
	/**
	 * 
	 * @param min 최소가격
	 * @param max 최대가격
	 * @return 입력한 가격에 해당하는 책 목록
	 */
	public Book[] searchBookByPrice(int min, int max) {
		
		int size = 0;
		Book[] temp = new Book[currentBs];
		
		//새로 생성한 배열에 값(min <= X <= max) 주입
		for(Book b : bs) {
			if(b == null)continue;
			if(b.getPrice() <= max && b.getPrice() >= min) {
				temp[size++] = b;
			}
		}
		return temp;
	}
		
	
	
	//기능 8. 모든 책들의 가격에 대한 합계
	
	/**
	 * 
	 * @return 모든 책들의 가격에 대한 합계
	 */
	public double getSumPriceOfBooks() {
		double sum = 0;
		for(Book b : bs) {
			if(b == null)continue;
			sum += b.getPrice();
		}
		return sum;
	}
	
	//기능 9. 모든 책들의 가격에 대한 평균
	
	/**
	 * 
	 * @return 모든 책들의 가격에 대한 평균
	 */
	public double getAvgPriceOfBooks() {
		return getSumPriceOfBooks()/currentBs;
	}
	
}
