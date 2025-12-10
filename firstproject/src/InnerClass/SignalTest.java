package InnerClass;
enum Traffic{
	RED,YELLOW,GREEN;
}
public class SignalTest {

	public static void main(String[] args) {
		Traffic s=Traffic.RED;
		switch(s){
		case RED->System.out.println("stop");

		case YELLOW->System.out.println("wait");
		case GREEN->System.out.println("go");
		}

	}

}
