package ExceptionHandling;

public class Arrayout2 {

	public static void main(String[] args) {
		int a[]=new int[2];
		try {
			a[0]=45;
			System.out.println(a[3]);
			
		}catch(Exception e) {
			System.out.println("exception");
		}
		///Index 3 out of bounds for length this we get without try and catch use if we try and catch
		/// we can handle like above
		
		//System.out.println(a[3]);

	}


}
