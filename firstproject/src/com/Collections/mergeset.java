package com.Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class mergeset {

	public static void main(String[] args) {
		Set<String> s=new LinkedHashSet<>();
		s.add("mani");
        s.add("ram");
        s.add("Java");
        Iterator<String> it= s.iterator();


        Set<String> s1=new LinkedHashSet<>();
        s1.add("chaitu");
		s1.add("ram");
		s1.add("java");
		Set<String> mer=new CopyOnWriteArraySet<>();
		
		for(String st:s) {
			mer.add(st.toLowerCase());
		}
		for(String st:s1) {
			mer.add(st.toLowerCase());
		}
		
		System.out.println(mer);
//String [] o=(String[])mer.toArray();
		for(String k:mer) {
			System.out.println(k);
		}
		
		}	
}
