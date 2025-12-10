package com.loopcondition;

import java.util.Scanner;

public class AtmOperation {
static Scanner sc=new Scanner(System.in);
double amount=35000;
	public static void main(String[] args) {
AtmOperation a=new AtmOperation();
AtmOperation a1=new AtmOperation();

System.out.println("1 deposte \n 2 withdraw ");
String s=sc.next();
String s1=sc.next();

if(s.equals("deposit")) {
	a1.deposit();
}
else if(s.equals("withdraw")) {
	a1.withdraw();
}
 else if(s.equals("pinchange")) {
	a1.pinChange();
}

else
{
	System.out.println("Invalid operation.Try again");
}
	}
 void deposit() {
	
	double a=sc.nextDouble();
	amount =amount+a;
	System.out.println(amount);
	
}
 void withdraw() {
	double a=sc.nextDouble();
	amount =amount-a;
	System.out.println(amount);	
}
 void pinChange() {
	 int oldpin=sc.nextInt();
	 int currentpin=sc.nextInt();
	 if(oldpin==currentpin) {
		 System.out.println("enter new pin");
		 int newpin=sc.nextInt();
		 if(newpin!=currentpin) {
			 System.out.println("successful changed");
		 }		
		 } 
	 else {
		 System.out.println("pin changed changed successfully"); 
	 }
 }
}
