package com.java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class stream {

	public static void main(String[] args) {
		List<String> name=new ArrayList<>();
		name.add("gill");
		name.add("jadeja");
		name.add("dhoni");
		name.add("gambir");
		name.add("hardik");
		name.add("rohit");
//Stream<String> st=name.stream();
//List<String>upname=st.filter((s)->s.contains("h")).collect(Collectors.toList());
System.out.println("******************************");
		List<String>upname=name.stream()
				.filter((s)->s.contains("h"))
				.sorted()
				.collect(Collectors.toList());
		System.out.println(upname);
//System.out.println("******************************");
//List<String>upname1=name.stream()
//.sorted()
//.map((s)->s.concat(" -india"))
//.collect(Collectors.toList());
//System.out.println(upname1);
	}
}
