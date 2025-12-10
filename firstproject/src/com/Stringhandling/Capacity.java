package com.Stringhandling;

public class Capacity {

	public static void main(String[] args) {
//		StringBuffer s=new StringBuffer("java");
//		s.append("123456789012345678901234567890123456789");//after 16=20*2+2=42 and then 42-4=38 from 38 on wards
//		                                                        // it increase 1; and you give 39 the one so=42+1=43
//		System.out.println(s.capacity());
//		s.append("12345678901234567890123456789012345678901234567");//here youtake new line so 43*2+2=88 and 88-43=45
//		                                                     // same up to 45 same after 45(45 is count ) 88+1+1=90
//		                                                    //because 2 like6,7
//		System.out.println(s.capacity());
//		s.append("123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123");
//		                                            //90*2+2=182 same like above 182=90=92 from 92(count)
//		//                                        on it increase 183
//	System.out.println(s.capacity());
		StringBuffer s=new StringBuffer("a");
		s.append("12345678901234567");
		s.append("123456789123456789123456789012345678901234567890123456789");
		s.append("111111234567890123456789012345678901234567890123456789012345678901234567890121");
		System.out.println(s.capacity());

	}

}
