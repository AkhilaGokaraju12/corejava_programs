package ExceptionHandling;

import java.io.*;

public class FileNot {

	public static void main(String[] args) throws Exception {
		System.out.println("started");
		File f=new File("c:/Users/saiki/OneDrive/Desktop/akhila java\\iofile.txt");
	
		
		FileReader fr=new FileReader(f);
		int i=fr.read();
		System.out.println((char)i);
		while(i!=-1) {
			System.out.println((char)i);
			i=fr.read();
			
		}
		System.out.println("ended");
	}
}
