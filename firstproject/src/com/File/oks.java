package com.File;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int a;
static transient String p;
int k;
}
public class oks {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("st");
		student s=new student();
		student s1=new student();
		s.a=10;
		s.p="okk";
		s1.k=78;
		FileOutputStream fos=new FileOutputStream("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\pract.src");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s);
		oos.writeObject(s1);
		FileInputStream fis=new FileInputStream("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\pract.src");
		ObjectInputStream ois=new ObjectInputStream(fis);
		student f=(student)ois.readObject();
		student f1=(student)ois.readObject();
		System.out.println(f.a);
		System.out.println(f.p);
		System.out.println(f1.k);

	}

}
