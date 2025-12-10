package com.loopcondition;

import java.util.Scanner;

public class ExpIf {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		System.out.println("name : "+name);
		int ex=s.nextInt();
		System.out.println("experience : "+ex);
	
	
		if(ex>0) {			
			if(ex>=0 && ex<=1) {
				System.out.println("bouns:"+0);
			}
		
			if(ex>=2 && ex<=4) {
				System.out.println("bouns:"+5000);
			}
			if(ex>=5 && ex<=9) {
				System.out.println("bouns:"+10000);
			}
			if(ex>9) {
				System.out.println("bouns"+20000);
			}
			
		}
	else {
			System.out.println("Invalid experience entered");
		}
		
		
		
		}

	}


