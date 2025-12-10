package com.Stringhandling;

public class DuplicateY {

	public static void main(String[] args) {
		String s="akhila";
		String o="";
		for(int i=0;i<s.length();i++) {
		boolean check=false;
		for(int j=0;j<o.length();j++) {
			if(o.charAt(j)==s.charAt(i)) {
				check=true;
			  
			}
		}
		if(!check) {
			o=o+s.charAt(i);
		}
		}
		System.out.println(o);
	}

}
