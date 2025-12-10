package com.Stringhandling;

public class A1B2C3 {

	public static void main(String[] args) {
String s="a1b2c3";
char []c=s.toCharArray();
String r="";
//for (int i = 1; i < c.length; i++) {
//    char e=c[i];
//     char previous=c[i-1];
//	if (Character.isDigit(e)) {
//		int n=Integer.parseInt(e+"");
//		for (int j = 1; j <= n; j++) {
//			r+=previous;
//		}
//	}
//}
//System.out.println(r);
//}
//
//}
for(int i=0;i<c.length;i++) {
	if(Character.isLetter(c[i])) {
		r=r+c[i];
	}
	else {
		if(Character.isDigit(c[i])) {
			int n=Integer.parseInt(c[i]+"");
			for(int j=1;j<=n-1;j++) {
				r=r+c[i-1];
			}
		}
	}
}
System.out.println(r);

	}

}
