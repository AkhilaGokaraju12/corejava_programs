package Assienment;

import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

class InValidAmountException extends RuntimeException{
	InValidAmountException(String s){
		super(s);
	}
	class InsufficientBalanceException extends InValidAmountException {
		InsufficientBalanceException(String s){
			super(s);
		}
	}
}
public class Account {
	static Scanner s=new Scanner(System.in);
	
	long l=67678898090l;
String name="Akhila";
static double b=10000;
	public static void main(String[] args) throws Exception {
		System.out.println("welcome to bank");
deposit();
withdraw();
deposit();
withdraw();
	}
static void deposit()  {
	System.out.println("enter money to deposit");
	int add=s.nextInt();
	if(add<=0) {
	throw new InValidAmountException("you should not throw less than 0");
	}
	else {
		System.out.println((b+add)+"  "+"deposited");
	}
}
static void withdraw() throws  InsufficientResourcesException  {
	System.out.println("enter money to withdraw");
	int wit=s.nextInt();
	if(wit>b) {
		throw new InsufficientResourcesException("Insufficient balance");
	}
	else {
		System.out.println((b-wit)+" "+"withdraw successfully");
		
	}
}
}
