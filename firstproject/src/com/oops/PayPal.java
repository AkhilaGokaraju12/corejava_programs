package com.oops;

public class PayPal implements PaymentSystem {

	@Override
	public void show(double amount) {
		System.out.println("your payment was paypal"+amount);
		
	}

}
