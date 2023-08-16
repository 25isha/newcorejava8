package mysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BatchEx {
	
	public static void insert(List<PersonEntity> personEntities) throws SQLException, ClassNotFoundException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Isha@12345");
	System.out.println("Database connect successfully");
	String query = "INSERT INTO emp1(id, name) VALUES( ?, ?)";
	PreparedStatement preparedStatement = con.prepareStatement(query);
	for (PersonEntity personEntity : personEntities) {
		preparedStatement.setInt(1, personEntity.getId());
		preparedStatement.setString(2, personEntity.getName());
		preparedStatement.addBatch();
	}
	preparedStatement.executeBatch();
}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		List<PersonEntity> l=new ArrayList<>();
		l.add(new PersonEntity(1,"ram"));
		l.add(new PersonEntity(2,"laxman"));
		insert(l);
	
		

	}

}
