package com.loopcondition2;

public class Remove {
	public static void main(String[] args) {
		   int a = 34567;
	       int digitToRemove = 6;
	       int result = 0,place = 1;

	       while (a > 0) {
	           int d = a % 10;
	           if (d != digitToRemove) {
	               result = result + d * place;
	               place *= 10;
	           }
	           a /= 10;
	       }
	       System.out.println(result);
	}

}
