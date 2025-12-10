package com.File;

import java.io.*;
//serilization
 class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String username;
transient String password;
 static int s;

 }
public class TestSerialization {

	public static void main(String[] args) throws IOException {
		System.out.println("started");
Employee e=new Employee();
Employee e1=new Employee();
Employee e2=new Employee();
e.username="akhila";
e.password="123";

//e1.username="ram";
//e1.password="8907";
//e2.username="chait4";
//e2.password="io889";

FileOutputStream fos=new FileOutputStream("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\serialization.src");
ObjectOutputStream oos=new ObjectOutputStream(fos);
oos.writeObject(e);
//oos.writeObject(e1);
//oos.writeObject(e2);
System.out.println("ended");

	}

}
