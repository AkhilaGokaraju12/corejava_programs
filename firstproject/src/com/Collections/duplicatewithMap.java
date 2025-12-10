package com.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class duplicatewithMap {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
Map<Character,Integer> m=new HashMap<>();
String str=s.nextLine();
char ch[]=str.toCharArray();
for(char c:ch) {
	if(m.containsKey(c)) {
		m.put(c,m.get(c)+1);
	}
	else {
		m.put(c,1);
	}
}
System.out.println(m);
Set<Map.Entry<Character,Integer>> e=m.entrySet();
for(Map.Entry s:e) {
	System.out.println(s);
}
	}

}
