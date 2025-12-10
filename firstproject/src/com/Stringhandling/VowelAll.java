package com.Stringhandling;

import java.util.Scanner;

public class VowelAll {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter a string");
		String s=sc.nextLine().toLowerCase();
char[]c=s.toCharArray();
int vow=0;
int conc=0;
int d=0;
int ch=0;
for(int i=0;i<c.length;i++) {
	if(Character.isLetter(c[i])|| c[i]==' ') {
		ch++;
		if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'){
			vow++;
		}
		else{
			if(c[i]==' ') {
				
			}
			else {
				conc++;
			}
		}
	}
	else {
		d++;
	}

}
System.out.println("digit"+" "+d);
System.out.println("character"+" "+ch);
System.out.println("vowel"+" "+vow);
System.out.println("consonent"+" "+conc);
	}

}
