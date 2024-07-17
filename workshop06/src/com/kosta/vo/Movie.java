package com.kosta.vo;

public class Movie {
	private String title;
	private String director;
	private int grade;
	private String genre;
	private String summary;
	//필드 선언
	
	public static final String BASIC_SUMMARY = "Summary";
	//static 변수 선언
	
	public Movie() {}
	public Movie(String title, String director, int grade, String genre, String summary) {
		super();
		this.title = title;
		this.director = director;
		this.grade = grade;
		this.genre = genre;
		this.summary = summary;
	}
	//기본 생성자, 명시적 생성자
	
	public Movie(String title, String director, int grade, String genre) {
		this(title, director, grade, genre,BASIC_SUMMARY);
	}
	//생성자 오버로딩
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	//모든 필드의 getter와 setter 생성
	
	public String toString() {
		return title+","+director+","+grade+","+genre+","+summary;
	}
	//getDetails 대신 toString으로 필드 값 불러오기
	
	
	
}
