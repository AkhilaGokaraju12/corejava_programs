package com.oops;

public class CreditCard implements PaymentSystem{
	public void show(double amount) {
		System.out.println("your payment was credit"+amount);
		
	}

}
