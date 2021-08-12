package com.ust.lambda;


public class Lambda1 {

	public static void main(String[] args)
    {

        HelloWorld mylambda1= (String s) -> {
        	System.out.println("Hello 1 "+s);
        	};
        
        HelloWorld mylambda2=  s -> {
        	System.out.println("Hello 2 "+s);
        	};
        
        mylambda1.greet("World");
        mylambda2.greet("JIP");    
      
    }
}
interface HelloWorld
{
    public void greet(String welcome);
}


