package Assienment;

import java.io.*;

public class FileAssisenment {

	public static void main(String[] args) throws IOException {
PrintWriter pw=new PrintWriter("C:\\Users\\saiki\\OneDrive\\Desktop\\akhila java\\Assign.txt");
System.out.println("created");
pw.println("RollNumber:"+" "+1);
pw.println("Name:"+" "+"Akhila");
pw.println("course:"+" "+"CSE");
pw.println("Marks"+" "+87);
pw.println("******");
pw.println("RollNumber: "+" "+2);
pw.println("Name:"+" "+"ram");
pw.println("course:"+" "+"IT");
pw.println("Marks"+" "+85);
pw.flush();
FileReader fr=new FileReader("C:\\\\Users\\\\saiki\\\\OneDrive\\\\Desktop\\\\akhila java\\\\Assign.txt");
BufferedReader br=new BufferedReader(fr);
String s=br.readLine();
int c=0;
while(s!=null) {
	System.out.println(s);
	c++;
	s=br.readLine();
}
System.out.println(c);
	}
}
