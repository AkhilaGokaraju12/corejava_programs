package com.Stringhandling;

public class subPExam {

	public static void main(String[] args) {
		String s="formadamfor";
		System.out.println("hello main");
		String l="";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String sub=s.substring(i, j);
				if(p(sub)&&sub.length()>l.length()) {
					l=sub;
				
	}
			}
			}
		System.out.println(l);
	}
	public static boolean p(String s) {
		String r="";
		for(int i=s.length()-1;i>=0;i--) {
			r=r+s.charAt(i);
		}
		return r.equals(s);
	}

}