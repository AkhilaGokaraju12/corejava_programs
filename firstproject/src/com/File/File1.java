package com.File;

import java.io.*;

public class File1 {

	public static void main(String[] args) throws IOException {
	File f=new File("C://Users//saiki//OneDrive//Desktop//akhila java//Hello.txt");
f.createNewFile();
System.out.println("created file");

//create folder

File f1=new File("C://Users//saiki//OneDrive//Desktop//akhila java//myfolder");
f1.mkdir();
System.out.println("folder created");
//create a file in folder
File f2=new File(f1,"world.txt");
f2.createNewFile();
System.out.println("file created in folder");
// to check folder is there or not
File e=new File("C://Users//saiki//OneDrive//Desktop//akhila java//hello.txt");
if(e.exists()) {
	System.out.println("there is file");
}
else {
	System.out.println("no file");
}
	}

}
