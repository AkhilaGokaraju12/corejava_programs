package com.java8Features;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date1 {
static final String old_foramt="dd/MM/yyyy";
static final String new_foramt="yyyy-MM-dd";
	public static void main(String[] args) throws ParseException {
long m=System.currentTimeMillis();
System.out.println(m);
Date d=new Date(m);
Date d1=new Date();
System.out.println("d1:"+d1);
System.out.println("d:"+d);
//String s="123";
//int i=Integer.parseInt(s);
//System.out.println(i+10);
String old_date="08/12/2025";
String new_date;
SimpleDateFormat sdf=new SimpleDateFormat(old_foramt);
Date da=sdf.parse(old_date);
sdf.applyPattern(new_foramt);
new_date=sdf.format(da);
System.out.println("old date : "+old_date);
System.out.println("new date : "+new_date);
	}
}
