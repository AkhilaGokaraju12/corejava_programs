package com.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assisenment {
	 static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
List<String> l=new ArrayList<>();
l.add("ram");
l.add("john");
l.add("chaitu");
String s=sc.next();

l.add(s);
int si=l.size();
for(int i=0;i<si;i++) {
	for(int j=i+1;j<si;j++ ) {
		if(l.get(i).equalsIgnoreCase(l.get(j))) {
			System.out.println("username already exists ");

		
		}

	}

}
System.out.println(l);
	}

}
