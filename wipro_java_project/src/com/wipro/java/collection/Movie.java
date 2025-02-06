package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Movie implements Comparable<Movie> {
	
	private String n;
	private double r;
	private int y;
	
	public Movie(String n, double r, int y) {
		this.n = n;
		this.r = r;
		this.y = y;
	}

	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return this.y - o.y;
	}
	
	public String getName() {
		return n;
	}
	
	public double getRating() {
		return r;
	}
	public int getYear() {
		return y;
	}
	
public static void main(String args[]) {
	ArrayList<Movie> l = new ArrayList<>();
	l.add(new Movie("Star Wars", 8.7, 1977));
	l.add(new Movie("Empire Strike Back", 8.8, 1980));
	l.add(new Movie("Return of the Jedi", 8.4, 1983));
	
	Collections.sort(l);
	
	System.out.println("Movies after sorting by year: ");
	for(Movie o : l) {
		System.out.println(o.getName()+" "+o.getRating()+" "+o.getYear());
	}
	
}
	
}
