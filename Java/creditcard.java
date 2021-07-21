package com.ust.examples;
class CreditCards{
    protected String cardName;
	private float creditBalance;
	
	CreditCards() {
		cardName = "Anjali";
		creditBalance = 25000;
	}
		void checkCardBalance() {
			if(creditBalance>=40000)
			{
				System.out.println("Sufficient balance");
			}
			else {
				System.out.println("Not much balance");
			}
		}
		
	
   void makePayment() {
	}

}
 class Visa extends CreditCards{
	  float interestRate;
	  float creditLimit;
	  
 Visa (String x,int y,float z){
	  super();
 }
void checkDiscounts() {
	 System.out.println("Many discounts will be provided");
}}
 class MasterCard extends CreditCards{
	 
	 void checkPaymentOpyions()
	  {
		  System.out.println("Online Payment mode is available");
	  }
 }
public class creditcard {

	public static void main(String[] args) {
		 Visa v = new Visa("Devika",1234,30000.56f);
		  v.checkCardBalance();

	}

}
