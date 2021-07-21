package com.ust.examples;
import java.util.*;
public class collection2 {

	public static void main(String[] args) {
   List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
    System.out.println("List :"+list);
  List sublist = Arrays.asList("three Four".split(" "));
  System.out.println("Sublist :"+sublist);
  System.out.println("indexOfSubList: " + Collections.indexOfSubList(list, sublist));
  System.out.println("lastIndecOfSubList: " + Collections.lastIndexOfSubList(list, sublist));
	}

}
