package mysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class AccessingData {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = null;
		c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "root", "Isha@12345");
		Statement s1 = (Statement) c.createStatement();
		ResultSet rs = null;
		rs = s1.executeQuery("select * from emp1");
		System.out.println("No of Records:");
		while (rs.next()) {
			// Display values

			System.out.print("ID: " + rs.getInt("id"));
			System.out.print(", Department: " + rs.getString("department"));
			System.out.println(", Name: " + rs.getString("name"));
			System.out.println(", Age: " + rs.getString("date"));

		}

	}
}

