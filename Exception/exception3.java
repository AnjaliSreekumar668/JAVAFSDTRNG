package com.ust.examples;

public class exception3 {

	public static void main(String[] args) {
		try {
			try {
				System.out.println("Inside block1");
				int b=45/0;
				System.out.println(b);
			
			
		}
		catch(ArithmeticException e1) {
			System.out.println("Exception: e1");
		}
		try {
			System.out.println("Inside block2");
			int b =45/0;
			System.out.println(b);
			
		}
		catch(ArrayIndexOutOfBoundsException e2) {
             System.out.println("Exception:e2");
	}
           System.out.println("Just other statement");
}

catch(ArithmeticException e3) {	
	System.out.println("Arithmetic Exception");
	System.out.println("Inside parent try catch block");
}
		 catch(ArrayIndexOutOfBoundsException e4) {
			 System.out.println("ArrayIndexOfBoundsException");
			 System.out.println("Inside parent try catch block");
		 }
		
		catch(Exception e5) {
			System.out.println("Exception");
			System.out.println("Inside parent try catch block");
		}
		System.out.println("Next statement..");
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
