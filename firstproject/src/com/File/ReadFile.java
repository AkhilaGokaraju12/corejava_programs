package com.File;

import java.io.*;

public class ReadFile {

	public static void main(String[] args) throws IOException {
File f=new File("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\hello.txt");
FileReader fr1=new FileReader(f);
FileReader fr=new FileReader("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\hello.txt");
int i=fr1.read();
System.out.println((char)i);
int c=0;
while(i!=-1) {
	System.out.print((char)i);
	c++;
	i=fr1.read();
}

System.out.println(c);
	}

}
