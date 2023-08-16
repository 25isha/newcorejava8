package mysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PerformOperations {

	public static void main(String[] args) throws SQLException {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Isha@12345");
		
		//insert and update both query don't execute at a time because of theye insert query give 2 time values.
		java.sql.Statement stmt;
		stmt=con.createStatement();
		String query1="INSERT INTO emp1 values('4','harshu','Enginer',5-2-2000)";
		stmt.executeUpdate(query1);
		System.out.println("Record is inserted");
		
		String query="update emp1 set name='haa' where id=2";
		stmt.executeUpdate(query);
		System.out.println("Record update");
		
		String query3="delete from emp1 where id=4";
		stmt.executeUpdate(query3);
		System.out.println("Record Deleted Successfully");
		

	}

}
