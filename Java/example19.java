package com.ust.examples;

public class example19 {

	public static void main(String[] args) {
		double array[]= {10,20,30,40,50};
		double sum =0.0;
		for(int i=0;i<array.length;i++) {
			sum =sum +array[i];
		}
		 double avg = sum/array.length;
		System.out.println("Average:"+avg);

	}

}
