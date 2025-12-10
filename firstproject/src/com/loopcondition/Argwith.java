package com.loopcondition;

public class Argwith {

	public static void main(String[] args) {
		String s=show();
		System.out.println(s);
		
		}
		static String show() {
			String res=" ";
			for(int i=1;i<=10;i++) {
				res=res+i+" ";
			}
			return res ;
		}


	

}
