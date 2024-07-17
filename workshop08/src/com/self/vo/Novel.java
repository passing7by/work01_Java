package com.self.vo;
/**
 * <pre>
 * 
 * {@code
 *  장서의 하위 카테고리인 Novel 클래스
 *  }
 *  
 *  </pre>
 *  
 *  @author 김지남
 *  @since 2024년 7월 9일
 */
public class Novel extends Book{
	/**
	 * 장르
	 */
	String genre;

	/**
	 * 
	 * @param isbn 책 고유번호
	 * @param title 책 제목
	 * @param author 작가
	 * @param publisher 출판사
	 * @param price 책 가격
	 * @param genre 장르
	 */
	public Novel(int isbn, String title, String author, String publisher, double price, String genre) {
		super(isbn, title, author, publisher, price);
		this.genre = genre;
	}
	
	/**
	 * 
	 * @return 장르
	 */
	public String getGenre() {
		return genre;
	}
	
	/**
	 * 
	 * @param genre 장르
	 */
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	/**
	 * 장서 정보
	 */
	public String getDetails() {
		return super.getDetails()+","+genre;
	}

}
