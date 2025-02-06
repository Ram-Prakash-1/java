package com.wipro.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Name implements Comparator<Movie1>{

	public int compare(Movie1 m1, Movie1 m2) {
		
		//Sort by name in alphabetical order
		return Double.compare(m1.getR(), m2.getR());
	}
	
	public static void main(String[] args) {
		
		//Create a list of movies
		ArrayList<Movie1> m1 = new ArrayList<>();
		m1.add(new Movie1("Force Awakens", 8.5, 2015));
		m1.add(new Movie1("Star wars", 8.7, 1977));
		m1.add(new Movie1("Empire Strikes Back", 8.8, 1980));
		
		//Sort Movies by name and Display them all
		Collections.sort(m1,new Rate());
		System.out.println("\n Movies Sorted by Name");
		for(Movie1 m : m1) {
			System.out.println(m.getN()+" "+m.getR()+" "+m.getY());
		}
	}

}