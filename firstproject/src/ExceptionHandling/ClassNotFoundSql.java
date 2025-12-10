package ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ClassNotFoundSql {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
	/// 1.Loading the Driver
			//Class.forName("ExceptionHandling.TestDemo");//here compiler satisfy using classNotFoundException
			System.out.println(Class.forName("ExceptionHandling.TestDemo"));
		Class.forName("com.mysql.cj.jdbc.Driver");//for this we do some install mysql-connector
		System.out.println("Driver class loaded successfully");
		
		/// 2.Establish the connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/batch61","root","root");
		System.out.println("database connection successfully created");
		
		///3.create a statement
Statement stmt=con.createStatement();

///4.create a ResultSet
String sql="select * from course";
ResultSet rs=stmt.executeQuery(sql);
// representing the data in console
while(rs.next()) {
	System.out.println(rs.getInt(1));
	System.out.println(rs.getString(2));
	System.out.println(rs.getInt(3));
	System.out.println(rs.getInt(4));
	System.out.println("********");
	
}
	}

}
