package com.edu.oop;

public class Movie2 {
	public String title;
	public String genre;
	public int rating;
	public String explain;

	public void setMovie2Field(String title, String genre, int rating, String explain) { //생성자와 set의 차이점: return 타입의 유무
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.explain = explain;
	}
	
	public String getMovie2Info() {
		return title + "," + genre + "," + rating + "," + explain;
	}
}
