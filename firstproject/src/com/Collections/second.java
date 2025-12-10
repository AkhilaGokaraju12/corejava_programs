package com.Collections;
import java.util.ArrayList;
import java.util.Collection;
public class second {

	public static void main(String[] args) {
Collection<String> boys=new ArrayList<>(6);
boys.add("ram");
boys.add("chaitu");
boys.add("phani");
Collection<String> boy=new ArrayList<>(6);
boy.add("ram");
boy.add("chaitu");
boy.add("phani");
System.out.println(boys.equals(true));
Collection<String> girls=new ArrayList<>();
girls.add("Akhila");
girls.add("lakshmi");
girls.add("prema");
girls.add("vani");
System.out.println("boys"+boys);
System.out.println("girls"+girls);
Collection<String>Students =new ArrayList<>();
Students.addAll(boys);
Students.addAll(girls);
System.out.println(Students.contains("ram"));


	}

}
