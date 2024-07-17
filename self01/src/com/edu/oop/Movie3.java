package com.edu.oop;

public class Movie3 {
	public String title;
	public String genre;
	public int rating;
	public String explain;
	
	public Movie3() {} //기본 생성자
	
	public Movie3(String title,String genre,int rating,String explain) { //명시적 생성자
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.explain = explain;
	}
	
	
	public String getMovie3Info() {
		return title + "," + genre + "," + rating + "," + explain;
	}
}
