package ExceptionHandling;

public class AssV {

	public static void main(String[] args) {
String s="Hello World".toLowerCase();
char[] a=s.toCharArray();
int v=0;
int ca=0;
String ce="";
for(char c:a) {
	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
		v++;
		
		ce=ce+(++c);
	}
	else {
		if(c==' ') {
			
		}
		else {
			ca++;
		}
		ce=ce+c;
	}
}
System.out.println("vowel"+ v);
System.out.println("consonent"+ca);
System.out.println(ce);

}
}
