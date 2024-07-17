package com.kosta.service;

import java.util.Arrays;

import com.kosta.vo.Movie;

public class MovieMgr {
	private int index;
	//필드 선언
	
	private static MovieMgr mgr = new MovieMgr();
	//싱글톤1. private static으로 객체 생성
	
	Movie[] movies;
	int idx;
	//배열과 배열의 인덱스번호로 쓸 변수 선언
	
	private MovieMgr(int size) {
		movies = new Movie[size];
		//배열 생성
		System.out.println("싱글톤으로 객체 하나만 일단 생성");
	}
	//싱글톤2. 생성자 앞에 private
	
	public static MovieMgr getInstance() {
		return mgr;
	}
	//싱글톤3. public static으로 getInstance 메소드 생성
	
	public void add(Movie m) {
		if(idx == movies.length)
			System.out.println("영화 등록 불가");
		else {
			movies[idx++] = m;
			System.out.println("영화 등록 완료");
		}
	}
	//기능1. 영화를 추가
	
	/*
	 * public Movie[] search() { Movie[] temp = new Movie[movies.length]; int idx =
	 * 0; for(Movie m : movies) { if(m.toString().equals()) temp[idx++] = m; }
	 * return temp;
	 * 
	 * }
	 */
	//기능2. 영화 검색
	
	public Movie[] search(String t) {
		Movie[] temp = new Movie[movies.length];
		int idx = 0;
		for(Movie m : movies) {
			if(m.getTitle().equals(t))
				temp[idx++] = m;
		}
		return temp;
	}
	//기능3. 영화 제목으로 영화 검색
	
	public Movie[] searchDirector(String d) {
		Movie[] temp = new Movie[movies.length];
		int idx = 0;
		for(Movie m : movies) {
			if(m.getDirector().equals(d))
				temp[idx++] = m;
		}
		return temp;
	}
	//기능4. 영화 감독으로 영화 검색
	
	public Movie[] searchGenre(String g) {
		Movie[] temp = new Movie[movies.length];
		int idx = 0;
		for(Movie m : movies) {
			if(m.getGenre().equals(g))
				temp[idx++] = m;
		}
		return temp;
	}
	//기능5. 영화 장르로 영화 검색
	
	public void delete(String title) {
		Movie[] temp = new Movie[movies.length-1];
		for(String )
		
		Movie[] copyMovie = Arrays.copyOfRange(temp, 0, temp.length-2);
		int idx = 0;
		
	}
	
	public int getSize() {
		return size;
	}
	
	
}
