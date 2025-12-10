package com.oops;

public class Employee1 {
private  String  name;
private  int id;
private  double salary;
public void setName(String name) {
	this.name=name;
}
public void setId(int id) {
	this.id=id;
}
public void setSalary(double salary) {
	this.salary=salary;
}
public String getName() {
	return name;
}
public int getId() {
	return id;
}
public double getSalary() {
	return salary;
}
public void displayinfo() {
	System.out.println(getName());
	System.out.println(getId());
	System.out.println(getSalary());
}
}
