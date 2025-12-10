package InnerClass;

interface wow{
void j();
}
public class Anonymous{
void ho() {
	
}
	public static void main(String[] args) {
		  wow g=new wow(){
				 static{
					 System.out.println("static");
				 }
					{
						System.out.println("1111111");
					}
					 static int a=90;
					 	
					 		public void j() {
					 			System.out.println("kk");
					 		}
		public static void main(String[] args) {

		}

					};
				
	g.j();
	}


}
