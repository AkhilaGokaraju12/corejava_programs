package com.File;

import java.io.*;


public class Test1Serilization {

	public static void main(String[] args) throws ClassNotFoundException, IOException  {
		System.out.println("started");
		FileInputStream fis=new FileInputStream("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\serialization.src");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Employee obj=(Employee)ois.readObject();
//		Employee obj1=(Employee)ois.readObject();
//		Employee obj2=(Employee)ois.readObject();
		System.out.println(obj.username);
		System.out.println(obj.password);
		System.out.println(obj.s);
//		System.out.println(obj1.password);
//		System.out.println(obj2.username);
//		System.out.println(obj2.password);
//		System.out.println(obj.s);


        
	}

}
