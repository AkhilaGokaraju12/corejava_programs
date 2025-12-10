package InnerClass;

public class Country {
	String country;
	Country(String country){
		this.country=country;
	}
class state{
	String state;
	state(String state){
		this.state=state;
	}
	void Info() {
		System.out.println("Country : "+country+" state : "+state);
	}
}
	public static void main(String[] args) {
		Country c=new Country("India");
	state s=c.new state("AndraPradesh");
	state s1=c.new state("Telaegana");
	state s2=c.new state("Tamilnadu");
s.Info();
s1.Info();
s2.Info();

	}

}
