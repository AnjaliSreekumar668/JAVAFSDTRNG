package com.ust.examples;
import java.io.*;
class one{
	public void print_geek() 
	{
		System.out.println("Geeks");
	}
}
class two extends one{
	public void print_for() 
	{
		System.out.println("for");
	
	}
}
public class example25 {

	public static void main(String[] args) {
		two g =new two();
		g.print_geek();
		g.print_for();
		g.print_geek();
		
	}

}
