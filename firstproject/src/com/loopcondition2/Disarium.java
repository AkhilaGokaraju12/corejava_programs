package com.loopcondition2;
import java.math.*;
public class Disarium {

	public static void main(String[] args) {
	int n=135;
	int temp=n;
	String s=Integer.toString(n);
  int p=s.length();
  int r=0;
  int sum=0;
  while(n!=0) {
	  r=n%10;
	  int k=1;
	  for(int i=1;i<=p;i++) {
		  k=k*r;
	  }
	  sum=sum+k;
	  //sum=sum+(int)Math.pow(r,p);
	  n=n/10;
	  p--;
  }
  if(sum==temp)
  System.out.println("Disarium");
  else
	  System.out.println(" not Disarium");
	}

}
