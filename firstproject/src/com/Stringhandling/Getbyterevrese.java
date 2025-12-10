package com.Stringhandling;

public class Getbyterevrese {

	public static void main(String[] args) {
String s="Akhila";
//byte[] b= {'A','k','h','i','l','a'};
//for(int c:b) {
//	System.out.println(c);
//}
//System.out.println("***");
byte []b=s.getBytes();

for(int i=0;i<b.length/2;i++) {
	byte temp=b[b.length-1-i];
	b[b.length-1-i]=b[i];
	b[i]=temp;
}
for(byte a:b) {
	System.out.print((char)a+"");
}

	}

}
