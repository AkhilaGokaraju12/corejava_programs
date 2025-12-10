package ExceptionHandling;

import java.io.FileNotFoundException;

public class predefinedthrow {

	public static void main(String[] args) throws FileNotFoundException {
int a=10;
int b=0;
System.out.println("started");
if(b!=0) {
	System.out.println(a/b);
}
else {
	throw new FileNotFoundException("Arey babu donot send zeros");

}
//try {
//	System.out.println(100/0);
//}catch(Exception e) {
//	throw new ArithmeticException("Arey babu donot send zeros");
//}
System.out.println("ended");
	}

}
