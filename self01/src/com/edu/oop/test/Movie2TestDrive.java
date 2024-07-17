package com.edu.oop.test;

import com.edu.oop.Movie2;

public class Movie2TestDrive {

	public static void main(String[] args) {
		Movie2 a = new Movie2();
		a.setMovie2Field("Gone with the Stock","Tragic",-2,"Playing the movie");
		
		System.out.println(a.getMovie2Info());
		
		Movie2 b = new Movie2();
		b.setMovie2Field("Lost in Cubicle Space","Comedy",5,"Playing the movie");
		
		System.out.println(b.getMovie2Info());
		
		Movie2 c = new Movie2();
		c.setMovie2Field("Byte Club","Tragic but ultimately",127,"Playing the movie");
		
		System.out.println(c.getMovie2Info());
		
	}

}
