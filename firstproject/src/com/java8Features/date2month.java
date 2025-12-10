package com.java8Features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class date2month {

	public static void main(String[] args) {
LocalDateTime l=LocalDateTime.of(1991,3,9, 10,3);
System.out.println("birth date : "+l);
System.out.println("birth date after 6 months : "+l.plusMonths(6));
System.out.println("birth date before 6 months : "+l.minusMonths(6));
LocalDateTime l1=LocalDateTime.now();
System.out.println(l1);
Date d=new Date();
System.out.println(d);
System.out.println("********");
int m=l1.getMonthValue();
int d1=l1.getDayOfMonth();
int yy=l1.getYear();
int hr=l1.getHour();
int min=l1.getMinute();
int sec=l1.getSecond();
System.out.printf("%d-%d-%d-%d-%d-%d\n",d1,m,yy,hr,min,sec);
System.out.println("***********");
////localdate
LocalDate ld= LocalDate.now();
System.out.println(ld);
int m1=ld.getMonthValue();
int d2=ld.getDayOfMonth();
int yy1=ld.getYear();
System.out.printf("local date :%d/%d/%d\n",d2,m1,yy1);
System.out.println("*********");
LocalTime t=LocalTime.now();
System.out.println(t);
int h2=t.getHour();
int min2=t.getMinute();
int sec2=t.getSecond();
System.out.printf("%d : %d : %d \n",h2,min2,sec2);

	}

}
