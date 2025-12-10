package com.File;
import java.io.*;
public class WriterBuffered {

	public static void main(String[] args) throws IOException   {
		System.out.println("started");
    File f=new File("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\justbuff.txt");
    FileWriter fw=new FileWriter(f,true);
    BufferedWriter br=new BufferedWriter(fw);
    br.write(89);
br.newLine();
    br.write('A');
    br.newLine();
    br.write("hello");
    br.newLine();
    br.flush();
  br.close();
  fw.close();
	}

}
