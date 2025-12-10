package com.File;

import java.io.*;

public class writerFile {

	public static void main(String[] args) throws IOException  {
		System.out.println("started");
		File f=new File("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java//just.txt");
		FileWriter fw=new FileWriter(f,true);
		fw.write(65);
		fw.write("\n");
	fw.write('H');
		fw.write("\n");
		fw.write("akhila");
		fw.write("\n");
		
	    fw.flush();
	    fw.close();
	

	}

}
