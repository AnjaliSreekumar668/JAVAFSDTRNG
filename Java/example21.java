package com.ust.examples;

public class example21 {
       int x;
       float y;
     String z;
     
     example21(){}
     example21(int a,float b){
    
        this.x = a;
        this.y = b;
     }
       example21(int a, float b, String c){
	x=a;
	y=b;
	z=c;
}
public static void main(String[] args) {
	example21 e1 =new example21();
	System.out.println(e1.x);
	example21 e2= new example21(2,3.0f);
	System.out.println(e2.y);		
	example21 e3=new example21(3,4.0f,"anjali");
	System.out.println(e3.z);
		

	}

}
