package com.loopcondition2;

import java.util.Scanner;

public class AssesmintA1 {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		int n=s.nextInt();
		int bike;
		double hour=0;
		for(int i=1;i<=n;i++) {
			System.out.println("number of bikes");
			 bike=s.nextInt();
				System.out.println("ask hour");
				int j=1;
			  while(j<=bike) {
				  hour=s.nextDouble();	
				if(hour>5) {
					System.out.println("charge for bike"+hour*5);
				}
				else {
				System.out.println("charge for bike"+ hour*50);		
				}
				 j++;
			}	
			
		}

	}

}
