package com.loopcondition2;

import java.util.Scanner;

public class FiDoWhile {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		String m="";
		do {
			String s1=s.next();
			int a=s.nextInt();
			int b=s.nextInt();
			int res=0;
		switch(s1) {
		case "+"->res=a+b;
		case "-"->res=a-b;
		case "*"->res=a*b;
		case "/"->res=a/b;
		}
		System.out.println(res);
		System.out.println("if you want to continue write 'y' or 'n' ");
	 m=s.next();
		}while(m.equalsIgnoreCase("y")); {
			
		}
		}

}
