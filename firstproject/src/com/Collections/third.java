package com.Collections;

import java.util.ArrayList;
import java.util.Collection;

public class third {

	public static void main(String[] args) {
		Collection<String> boys=new ArrayList<>(6);
		boys.add("ram");
		boys.add("chaitu");
		boys.add("phani");
		boys.add("mani");

		Collection<String> girls=new ArrayList<>();
		girls.add("Akhila");
		girls.add("lakshmi");
		girls.add("prema");
		girls.add("vani");

		Collection<String>Students =new ArrayList<>();
		Students.addAll(boys);
		Students.addAll(girls);
		System.out.println();
	



	}

}
