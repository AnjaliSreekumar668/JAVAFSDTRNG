package com.ust.examples;
import java.util.*;
public class example30 {

	public static void main(String[] args) 
		
	{
String original,reverse = "";
      Scanner sct = new Scanner(System.in);
       System.out.println("Enter string to reverse");
        original = sct.nextLine();
             int length = original.length();
               for(int i = length -1;i>=0;i--)
	
	reverse = reverse + original.charAt(i);
   System.out.println("Reverse of entered string is:"+reverse);
}
}
