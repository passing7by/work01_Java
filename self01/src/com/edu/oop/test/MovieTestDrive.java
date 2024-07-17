package com.edu.oop.test;

import com.edu.oop.Movie;

public class MovieTestDrive {
	public static void main(String[] args) {
		
		Movie a = new Movie("Gone with the Stock","Tragic",-2,"Playing the movie");
		
		System.out.println(a.getMovieInfo());
		
		Movie b = new Movie("Lost in Cubicle Space","Comedy",5,"Playing the movie");
		
		System.out.println(b.getMovieInfo());
		
		Movie c = new Movie("Byte Club","Tragic but ultimately",127,"Playing the movie");
		
		System.out.println(c.getMovieInfo());
	}

	
}
