package mysqlEx;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallableProcedureEx {

	public static void main(String[] args) {
		String jdbcUrl = "jdbc:mysql://localhost:3306/mydatabase?useSSL=false";
        String username = "root";
        String password = "Isha@12345";
        String sql = "call college_procedure()";

        try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); CallableStatement stmt = conn.prepareCall(sql); ResultSet rs = stmt.executeQuery();) {

            while (rs.next()) {
                System.out.println("Rollno = " + rs.getInt(1) + ", NAME = " + rs.getString(2) + ", filed = " +
                    rs.getString(3) + ", clgname = " + rs.getString(4));
            }

        } catch (SQLException e) {
            e.printStackTrace();
      
        }

	}

}
