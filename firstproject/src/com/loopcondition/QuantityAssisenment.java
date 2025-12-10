package com.loopcondition;

import java.util.Scanner;

public class QuantityAssisenment {
static Scanner s=new Scanner(System.in);
static int q=s.nextInt();
	public static void main(String[] args) {
	System.out.println("1.SouthIndian 2.NorthIndian 3.Chinese");
int item=s.nextInt();
if(item>0) {
if(item==1) {
	southIndian();
if(q==1)
	System.out.println("no discount");
if(q>=3)
	System.out.println("20 ruppes discount");
}
if(item==2) {
	NorthIndian();
if(q==1)
	System.out.println("no discount");
if(q>=3)
	System.out.println("20 ruppes discount");
}
if(item==3) {
	chinese();
	if(q==1)
		System.out.println("no discount");
	if(q>=3)
		System.out.println("20 ruppes discount");
}
}  
else
System.out.println("no food category is not avaliable");
	}
 static void southIndian() {
	System.out.println("1.Biranyi -100,2.sambarrice-89,3.chickencurry-90");
	System.out.println("select the items what do you want");
	String s1=s.next();

  if(q==2) {
	 if(s1.equals("Biryani"))
	   System.out.println(100-(100*0.1));
   if(s1.equals("sambarrice"))
	   System.out.println(89-(89*0.1));
   if(s1.equals("chickencurry"))
	   System.out.println(90-(90*0.1));
   }
 	
}
 static void NorthIndian() {
		System.out.println("1.roti -50, 2.pavbaji-90, 3.kheer-45");
		System.out.println("select the items what do you want");
		String s1=s.next();	
	   if(q==2) {
		 if(s1.equals("roti"))
		   System.out.println(50-(50*0.1));
	   if(s1.equals("pavbaji"))
		   System.out.println(90-(90*0.1));
	   if(s1.equals("kheer"))
		   System.out.println(45-(45*0.1));
	   }
	   
	}
 static void chinese() {
		System.out.println("1.friedrice-100 2.noddles-90 3.gobi-80");
		System.out.println("select the items what do you want");	
		String s1=s.next();	
	   if(q==2) {
		
		 if(s1.equals("friedrice"))
		   System.out.println(100-(100*0.1));
	   if(s1.equals("noddles"))
		   System.out.println(90-(90*0.1));
	   if(s1.equals("gobi"))
		   System.out.println(80-(80*0.1));
	   }

	}
 }

