package com.ust.examples;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class fileexample1 {

	public static void main(String[] args) {
		try {
			FileWriter fName = new FileWriter("D:\\ustjava\\fileexample1.txt");
			fName.write("i am writing to the file");
			fName.close();
		}
catch(IOException e) {
	e.printStackTrace();
}
		
try {
	
	FileInputStream input =new  FileInputStream("D:\\ustjava\\fileexample1.txt");
	System.out.println("Data in the file:");

int i =input.read();
while (i!=-1) {
	System.out.print((char)i);
	i = input.read();
}
input.close();
	}

	catch(Exception e) {
		e.getStackTrace();
	}
}
}
