package ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class IntruptedException {

	public static void main(String[] args) throws IOException, InterruptedException {
		File f=new File("C:/Users/saiki/OneDrive/Desktop/akhila java\\iofile.txt");
	
		
		FileReader fr=new FileReader(f);
		int i=fr.read();
		//System.out.println((char)i);
		while(i!=-1) {
			System.out.print((char)i);
			 i=fr.read();
			Thread.sleep(1000);

	}
		
	}
}
