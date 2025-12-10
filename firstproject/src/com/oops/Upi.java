package com.oops;

public class Upi implements PaymentSystem{

	@Override
	public void show(double amount) {
		System.out.println("your payment was upi"+amount);
		
	}

}
