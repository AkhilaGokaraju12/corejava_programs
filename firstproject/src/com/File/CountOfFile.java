package com.File;

import java.io.File;
import java.io.IOException;

public class CountOfFile {

	public static void main(String[] args) throws IOException {
File f=new File("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java");
String[] names=f.list();
int c=0;
for(String n:names) {
	System.out.println(n);
	c++;
}
System.out.println(c);
System.out.println("Totalspace"+f.getTotalSpace());
System.out.println("Freespace"+f.getFreeSpace());
System.out.println("path"+f.getAbsolutePath());
System.out.println("path1"+f.getCanonicalPath());
	}

}
