package com.loopcondition;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	///one model with third variable
    //int temp=a;
	//a=b;
	//b=temp;
	//System.out.println("swap of A:"+a);
	//System.out.println("swap of B:"+b);
	/// with arthematic
	//a=a+b;
	//b=a-b;
	//a=a-b;
	//System.out.println("swap of A:"+a);
	//System.out.println("swap of B:"+b);
	/// with bitwise operator
a=a^b;
b=a^b;
a=a^b;
System.out.println("swap of A:"+a);
System.out.println("swap of B:"+b);


	}

}
