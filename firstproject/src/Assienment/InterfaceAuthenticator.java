package Assienment;

public interface InterfaceAuthenticator {
boolean authenticate(String user,String password);
}
class DatabaseAuthenticator implements InterfaceAuthenticator {
String user="Akhila";
String password="23tyi";
	@Override
	public boolean authenticate(String user, String password) {
	if(this.user==user && this.password==password) {
		return true;
	}

	return false;
	}
	
}
class  LDAPAuthenticator implements InterfaceAuthenticator {
	
	String user="ram";
	String password="123oo";
	@Override
	public boolean authenticate(String user, String password) {
		if(this.user==user && this.password==password) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
class testAuthentication{
	public static void main(String[] args) {
		InterfaceAuthenticator d=new DatabaseAuthenticator();
		InterfaceAuthenticator l=new LDAPAuthenticator();
if(d.authenticate("Akhila","23tyi")) {
	System.out.println("user is authenticated successfully");
}
else {
	System.out.println("user is authenticated not successfully");
}

if(l.authenticate("ram","2tyi")) {
	System.out.println("user is authenticated successfully");
}
else {
	System.out.println("user is authenticated not successfully");
}
	}
}

