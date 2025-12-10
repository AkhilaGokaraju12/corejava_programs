
public class Employee {
	String EmployeeName;
	boolean hasAccessCard;
	boolean biometricMatch;
	boolean isBlacklisted;
	boolean doorHasPower;
	Employee(){
		
	}
 Employee(String EmployeeName, boolean hasAccessCard, boolean biometricMatch, boolean isBlacklisted,
			boolean doorHasPower) {
		this.EmployeeName = EmployeeName;
		this.hasAccessCard = hasAccessCard;
		this.biometricMatch = biometricMatch;
		this.isBlacklisted = isBlacklisted;
		this.doorHasPower = doorHasPower;

		
	}

	public static void main(String[] args) {
	Employee e= new Employee("Akhila",true,true,false,true);
Employee e1=new Employee();
	e1.displayResult();


	}
	 boolean canAccess() {
		return hasAccessCard&&biometricMatch&&isBlacklisted&&doorHasPower;
	}
	void displayResult() {
		System.out.println(EmployeeName);
		System.out.println(canAccess());
	}
}
