package com.ust.examples;
class Animal{
	String name;
	public void eat()
	{
		System.out.println("I can eat");
	}
}
   class Dog extends Animal{
	   public void display() {
		   System.out.println("My name is " +name);
	   }
   }
public class example24 {

	public static void main(String[] args) {
	
Dog labrador = new Dog();
labrador.name ="Rohu";
labrador.display();
labrador.eat();
	}

}
