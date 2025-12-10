package com.Stringhandling;

public class sort {

	public static void main(String[] args) {
String s="am2 i1 to4 going10 this6 weekend7 hometown5";
//char c[]=s.toCharArray();
//
//for(int i=0;i<c.length;i++) {
//	if(Character.isDigit(c[i])) {
//		
//		c[i]=' ';
//	}
//}
//for(char c1:c) {
//	System.out.print(c1);
//}
String s1[]=s.split(" ");
//System.out.println(s1.length);
//for(String c1:s1) {
//System.out.print(c1+",");
//}
//System.out.println(s1.length);
for(int i=1;i<=10;i++) {
for(String c1:s1) {
if(c1.contains(""+i)) {
	System.out.println(c1.replaceAll("[0-9]",""));
}
}
}
String s3="akhila";
System.out.println(s3.replaceAll("a","u"));
	}

}
