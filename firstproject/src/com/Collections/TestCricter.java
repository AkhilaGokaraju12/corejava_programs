package com.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCricter {

	public static void main(String[] args) {
		Cricketer c=new Cricketer(1,"dhoni",3);
		Cricketer c1=new Cricketer(2,"ram",2);
		Cricketer c2=new Cricketer(3,"anil",5);
		Cricketer c3=new Cricketer(4,"how",7);
		Cricketer c4=new Cricketer(5,"to",1);
		Cricketer c5=new Cricketer(6,"ok",3);
List<Cricketer> cr=new ArrayList<>();
cr.add(c);
cr.add(c1);
cr.add(c2);
cr.add(c3);
cr.add(c4);
cr.add(c5);
Collections.sort(cr);
for(Cricketer cr1:cr) {
System.out.println(cr1);
}
	}

}
