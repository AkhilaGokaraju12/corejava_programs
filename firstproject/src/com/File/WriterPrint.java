package com.File;
import java.io.*;
public class WriterPrint {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("started");
		//File f=new File("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\justprint.txt");
PrintWriter pw =new PrintWriter("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\justprint.txt");
pw.println(true);
pw.println(65);
pw.println('A');
pw.println("Akhila");
pw.flush();

	}

}
//File f=new File("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java//hello.txt");
//PrintWriter pw=new PrintWriter(new FileWriter(f,true));