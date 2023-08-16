package mysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class PreparedStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/mydatabase";
		Connection c=DriverManager.getConnection(url,"root","Isha@12345");
		System.out.println("Database connect successfully");
		PreparedStatement p;
		String s="insert into emp1 values(?,?,?,?)";
		p=c.prepareStatement(s);
//		p.setInt(1,40);
//		p.setString(2,"ishaha");
//		p.setString(3,"mumbai");
//		p.setInt(4, 2003);
//		
//		p.setInt(1,50);
//		p.setString(2,"harshu");
//		p.setString(3,"navi mumbai");
//		p.setInt(4, 2004);
		
//		p.executeUpdate();
//		System.out.println("Record created");
		
//		PreparedStatement p1 = c.prepareStatement("update emp set name=? where id=?");
//		p.setInt(1, 1);
//		p.setString(2, "dolly");
//	
//		p.executeUpdate();
//	
//		
		PreparedStatement prest = c.prepareStatement("UPDATE teacher SET name = ? WHERE id = ?");
		prest.setString(1, "prisha");//1 is take sequnce number and we to update value putting there....
		prest.setString(2, "3");//1 means index or sequnce and 3 is a id posion...
		prest.executeUpdate();
		System.out.println("Record update");
//		
//		PreparedStatement prest1 = c.prepareStatement("DELETE FROM emp1 WHERE id = ?");
//		prest1.setString(1, "1");
//		prest1.executeUpdate();
//		System.out.println("deleted");
		
		
	}
	
	
	//String sql1= "CREATE TABLE STUDENT(STUDENTID VARCHAR2(10) PRIMARY KEY,NAME VARCHAR2(20),DEPARTMENT VARCHAR2(10))";

	

}