package com.oops;

public class exec {
public static void main(String[] args) {
	 PayPal p=new  PayPal();
	 Upi u=new Upi();
	 CreditCard c=new CreditCard();
	 PaymentSystem p1=new  PayPal();
	 PaymentSystem u1=new  Upi();
	 PaymentSystem c1=new  CreditCard();
	 p1.show(30000);
	 u1.show(10000);
	 c1.show(20000);
//	p.show(1000);
//	u.show(3000);
//	c.show(89897);
	 
}
}
