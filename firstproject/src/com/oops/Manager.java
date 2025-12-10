package com.oops;
class Employee2{
private int empno;	
private String name;
private String deptName;
public void setEmpno(int empno) {
	this.empno=empno;
}
public int getEmpno() {
	return empno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDeptName() {
	return deptName;
}
public void setDeptName(String deptName) {
	this.deptName = deptName;
}
}
public class Manager extends Employee2 {
String deptno;
	public static void main(String[] args) {
		Manager m=new Manager();

		m.setEmpno(21);
		m.setName("Akhila");
	    m.setDeptName("cse");
		m.display();

		
	}
	public void setDeptno(String deptno) {
		this.deptno=deptno;
	}
	public String getDeptno() {
		return deptno;
	}
void display() {
	System.out.println(getName());
	System.out.println(getEmpno());
	System.out.println(getDeptName());
}
Manager(){
	System.out.println("hello child");
}
}
