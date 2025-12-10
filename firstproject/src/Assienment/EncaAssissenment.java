package Assienment;

public class EncaAssissenment {
	private   String name;
	private int age;
	private int rollNumber;
	private double GPA;
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAge(int age) {
		this.age=age;
		if(this.age>0) {
			System.out.println(getAge());
		}
	}
	public void setrollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	public void setGPA(int GPA) {
		this.GPA=GPA;
			if(GPA>0.0 && GPA<=10.0) {
				System.out.println(getGPA());
			}
			else {
				System.out.println("invalid GPA");
			}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public double getGPA() {
		return GPA;
	}
  void displayInfo() {
	System.out.println(getName());
	System.out.println(getRollNumber());
	}
}
