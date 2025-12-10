package com.Stringhandling;

public class Exam {

	public static void main(String[] args) {
String s="alphadiai";
char ch[]=s.toCharArray();

String out="";
for(int i=0;i<ch.length;i++) {
	int c=0;
for(int j=0;j<ch.length;j++) {
	if(ch[i]==ch[j]) {
		c++;
	}
}
if(c==1) {
	out=out+" "+ch[i];
}
}
System.out.println(out);
	}

}
