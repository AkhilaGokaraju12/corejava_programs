package ExceptionHandling;

public class Nullmethod {

	public static void main(String[] args) {
	Nullmethod m=null;
	
try {
	System.out.println("try");
	m.how();
}catch(Exception e) {
	System.out.println("catch");
}
	}
	void how() {
		System.out.println("hello");
	}

}
