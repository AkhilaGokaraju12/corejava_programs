package com.Stringhandling;

public class joinSplit {

	public static void main(String[] args) {
String s=String.join("@","AKhila","chaitu","ram");
System.out.println(s);
String []s1=s.split("@");
for(String d:s1) {
	System.out.println(d);
}
System.out.println("********");
String []s2=s.split("@",2	);
for(String d:s2) {
	System.out.println(d);
}
String s4= "aki3hi3gji3ji2ft";
String sh[]=s4.split("i",2);
for(String d:sh) {
	System.out.println(d);
}

////
String r="am2 i1 to4 going3 this6 weekend7 hometown5";
String arr[]=r.split(" ");
for(String na:arr) {
	System.out.println(na);
}
	}

}
