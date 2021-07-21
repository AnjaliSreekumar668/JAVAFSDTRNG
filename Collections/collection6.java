package com.ust.examples;
import java.util.*;
public class collection6 {

	public static void main(String[] args) {
		
TreeSet<String> ts = new TreeSet<String>();
ts.add("Geeks");
ts.add("For");
ts.add("Geeks");
ts.add("Is");
ts.add("Very Helpful");
Iterator<String> itr =ts.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}



	}

}
