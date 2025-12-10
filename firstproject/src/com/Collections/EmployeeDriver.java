package com.Collections;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDriver {

	public static void main(String[] args) {
Employee e=new Employee(21,"ram");
Employee e1=new Employee(22,"akhila");
Employee e2=new Employee(23,"raju");
Employee e3=new Employee(24,"san");
Employee e4=new Employee(25,"mal");
List<Employee> l=new ArrayList<>();
l.add(e);
l.add(e1);
l.add(e2);
l.add(e3);
l.add(e4);
System.out.println(l);
for(int i=0;i<l.size();i++) {
	System.out.println(l.get(i));
}
	}

}
