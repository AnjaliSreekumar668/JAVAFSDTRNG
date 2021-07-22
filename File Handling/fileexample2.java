package com.ust.examples;
import java.io.FileReader;

public class fileexample2{


	public static void main(String[] args) {
		
		
		char[] array = new char[100];
		try {
			FileReader input = new FileReader("D:\\ustjava\\fileexample1.txt");
			input.read(array);
			System.out.println("Data in the file");
			System.out.println(array);
			input.close();
		}
     catch(Exception e) {
	
		e.getStackTrace();
	}
	}
}






