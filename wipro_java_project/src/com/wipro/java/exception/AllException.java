package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class AllException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			File file = new File("Empty path");
			FileReader reader = new FileReader(file);
		}
		catch(IOException e){
			System.out.println(e);
		}
		
		
		try {
			String s1 = null;
			System.out.println(s1.length());
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
