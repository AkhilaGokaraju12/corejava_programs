package ExceptionHandling;

import java.io.*;

public class IoException {

	public static void main(String[] args) throws IOException  {
		System.out.println("started");
		File f=new File("c:/Users/saiki/OneDrive/Desktop/akhila java\\iofile.txt");
f.createNewFile();
//		
//		try {
//		f.createNewFile();
//
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println("hello");
//		}
	
	System.out.println("ended");

	}

}
