package mysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class CheckingConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mydatabase";
		Connection con=DriverManager.getConnection(url,"root","Isha@12345");
		System.out.println("Database connect successfully");
		System.out.println(con);
		
		java.sql.Statement stmt;
		stmt=con.createStatement();
		String query1="INSERT INTO emp1 values('3','dolly','Enginer',2005)";
		stmt.executeUpdate(query1);
		System.out.println("Record is inserted");
		
//		String query2="update emp1 set name='mau' where id=2";
//		stmt.executeUpdate(query2);
//		System.out.println("Record update");
//		
//		String query3="delete from emp1 where id=3";
//		stmt.executeUpdate(query3);
//		System.out.println("Record Deleted Successfully");
		
		
	}
	

}
