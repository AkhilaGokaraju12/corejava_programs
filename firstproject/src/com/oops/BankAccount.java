package com.oops;

import java.util.Scanner;

public abstract class BankAccount {
	
	static Scanner s=new Scanner(System.in);
 int accountNumber;
double balance;
double interest;
abstract void calculateInterest();
BankAccount( int accountNumber,double balance){
	 this.balance=balance;
	this.accountNumber=accountNumber;
}
void deposit(double amount) {
	balance=balance+amount;
	System.out.println("total balance:"+balance);
}
void withdraw(double amount) {
	if(balance>amount) {
		balance=balance-amount;
	System.out.println("total balance:"+balance);
	}
	else {
		System.out.println("incifient balance");
	}
}
}

class SavingAccount extends BankAccount{
	SavingAccount(){
		super(21345667,40000);
	}
	@Override
	void calculateInterest() {
     interest=balance*0.05;
     System.out.println(interest);
		
	}
	
}
class CurrentAccount extends BankAccount{
CurrentAccount(){
	super(6779890,50000);
}
	@Override
	void calculateInterest() {
     interest=balance*0.02;
     System.out.println(interest);
		
	}	

}
class Test{

	public static void main(String[] args) {
		
		BankAccount b=new CurrentAccount();
		System.out.println("account number:"+b.accountNumber);
		b.deposit(10000);
		b.calculateInterest();

		BankAccount b1=new SavingAccount();
		System.out.println("account number:"+b1.accountNumber);
		b1.withdraw(10000);
		b1.calculateInterest();
		
		
	}
}
