package com.ust.examples;

public class example4 {

	public static void main(String[] args) {
	//string[] str = new string[5];
		String[]str= {"alona","sarmada","hari","arya","anjali"};
		for(int i=0;i<=str.length;i++) {
			if(str[i].equals("hari"))
				break;
			System.out.println(str[i]);
		}

	}

}
