package mysqlEx;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CallAbleStatementEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Isha@12345");
		System.out.println("Database connect successfully");
		//Statement stmt;
//		CallableStatement statement = con.prepareCall("{call doctor_procedure(?)}");
//		statement.setString(1, "esh");
//		statement.execute();
//		statement.close();
		
		CallableStatement statement = con.prepareCall("{call system_procedure()}");
		statement.execute();
		statement.close();


		System.out.println("Stored procedure called successfully!");
	}

}
