package com.self.vo;
/**
 * <pre>
 * 
 * {@code
 *  장서의 하위 카테고리인 Magazine 클래스
 *  }
 *  
 *  </pre>
 *  
 *  @author 김지남
 *  @since 2024년 7월 9일
 */
public class Magazine extends Book{
	/**
	 * 잡지 출간월
	 */
	int pubMonth;
	
	/**
	 * 
	 * @param isbn 책 고유번호
	 * @param title 책 제목
	 * @param author 작가
	 * @param publisher 출판사
	 * @param price 책 가격
	 * @param pubMonth 잡지 출간월
	 */
	public Magazine(int isbn, String title, String author, String publisher, double price, int pubMonth) {
		super(isbn, title, author, publisher, price);
		this.pubMonth = pubMonth;
	}
	
	/**
	 * 
	 * @return 잡지 출간월
	 */
	public int getPubMonth() {
		return pubMonth;
	}
	
	/**
	 * 
	 * @param pubMonth 잡지 출간월
	 */
	public void setPubMonth(int pubMonth) {
		this.pubMonth = pubMonth;
	}
	
	/**
	 * 장서 정보
	 */
	public String getDetails() {
		return super.getDetails()+","+pubMonth;
	}

}
