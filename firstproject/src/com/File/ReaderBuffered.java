package com.File;

import java.io.*;


public class ReaderBuffered {

	public static void main(String[] args) throws IOException {
File f=new File("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java//Hello.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);
String i=br.readLine();
System.out.println(i);
int c=0;
while(i!=null) {
	System.out.println(i);
	c++;
	i=br.readLine();
}

	}

}
