package com.ust.examples;
import java.util.Enumeration;
import java.util.Hashtable;
public class collection3 {

	public static void main(String[] args) {
		Hashtable ht =new Hashtable();
		ht.put("1", "One");
		ht.put("2", "Two");
		ht.put("3", "Three");
		Enumeration e = ht.keys();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}
