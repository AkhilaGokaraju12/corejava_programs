package com.Stringhandling;

public class palindrom {

	public static void main(String[] args) {
String s="malayalam";
String r="";
String s1="";
String p="";
for(int i=0;i<s.length();i++) {
	for(int j=i+1;j<s.length();j++) {
 r="";
s1=s.substring(i,j);
for(int i1=0;i1<s1.length();i1++) {
	r=s1.charAt(i1)+r;
}
if(s1.length()>1) {
if(s1.equals(r)) {
	p=s1;
	break;

}
}
	}
	if(s1.length()>1) {
		if(s1.equals(r)) {
			break;
		}
}
	
}
if(p.length()>=1) {
	System.out.println(p);
}
else {
	System.out.println("no");
}
	}
}
