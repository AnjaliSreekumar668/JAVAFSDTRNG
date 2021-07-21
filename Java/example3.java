package com.ust.examples;

public class example3 {
  float price;
  String item;
  
	public static void main(String[] args) {
		example3 e1=new example3();
		example3 e2=new example3();
		e1.price=1.2f;
		e2.price=1.2f;
		e1.item= "pen";
		e2.item= "book";
		if(e1.price>e2.price) {
			e1.item="scale";
		}
		if(e1.price==e2.price) {
			e1.item="pencil";
		}
		else {
			e1.item="box";
		}
		System.out.println(e1.item);
		}
		

	}


