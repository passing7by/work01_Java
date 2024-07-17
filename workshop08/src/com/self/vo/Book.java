package com.self.vo;
/**
 * <pre>
 * 
 * {@code
 *  장서의 상위 카테고리 클래스
 *  }
 *  
 *  </pre>
 *  
 *  @author 김지남
 *  @since 2024년 7월 9일
 */
public class Book {
	/**
	 * 책 고유번호
	 */
	int isbn;
	/**
	 * 책 제목
	 */
	String title;
	/**
	 * 작가
	 */
	String author;
	/**
	 * 출판사
	 */
	String publisher;
	/**
	 * 책 가격
	 */
	double price;
	
	/**
	 * 
	 * @param isbn 책 고유번호
	 * @param title 책 제목
	 * @param author 작가
	 * @param publisher 출판사
	 * @param price 책 가격
	 */
	public Book(int isbn, String title, String author, String publisher, double price) {
		super();
		this.isbn = isbn; //책의 고유 번호
		this.title = title; //책 제목
		this.author = author; //작가
		this.publisher = publisher; //출판사
		this.price = price; //가격
	}
	
	/**
	 * 
	 * @return 고유번호
	 */
	public int getIsbn() {
		return isbn;
	}
	
	/**
	 * 
	 * @param isbn 고유번호
	 */
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * 
	 * @return 책 제목
	 */
	public String getTitle() {
		return title;
	}
	
	/**
	 * 
	 * @param title 책 제목
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 
	 * @return 작가
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * 
	 * @param author 작가
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * 
	 * @return 출판사
	 */
	public String getPublisher() {
		return publisher;
	}
	
	/**
	 * 
	 * @param publisher 출판사
	 */
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	/**
	 * 
	 * @return 책 가격
	 */
	public double getPrice() {
		return price;
	}
	
	/**
	 * 
	 * @param price 책 가격
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * 
	 * @return 장서 정보
	 */
	public String getDetails() {
		return isbn+","+title+","+author+","+publisher+","+price;
	}
	
	
	
	
}
