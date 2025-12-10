package ExceptionHandling;

import java.sql.SQLException;
import java.util.Scanner;

public class UserdefinedException {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		//int age=sc.nextInt();
//if(age>=18) {
//	System.out.println("you are eligible");
//}
//else {
//	throw new WhatException("arey niku inka time vundi ra");
//}
//	}
		try {
			throw new WhatException("oo");
		}catch(RuntimeException e) {
			System.out.println("kk");
		}
	}
}
