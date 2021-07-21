package com.ust.examples;

public class example23 {
String web;
example23(String w){
	web = w;
}
       example23(example23 cc){
    	   web = cc.web;
       }
       void disp() {
    	   System.out.println("constructor:"+web);
       }
       public static void main(String args[]) {
    	   example23 obj1 = new example23("Example of copy constructor in java");
    	   example23 obj2 = new example23(obj1);
    	   obj1.disp();
    	   obj2.disp();
       }
}
