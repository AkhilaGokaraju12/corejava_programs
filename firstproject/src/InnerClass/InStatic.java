package InnerClass;

public class InStatic {

static {
	System.out.println("static");
}
{
	System.out.println("iibst");
}
	public static void main(String[] args) {
		InStatic.Eat t=new InStatic.Eat();
		
	}

	static class Eat{
		static int b=90;
		int s=78;

	public static void main(String[] args) {
		InStatic.Eat t=new InStatic.Eat();
	}

	}
}
