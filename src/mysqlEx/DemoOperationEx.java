package mysqlEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DemoOperationEx {
	 static  int id;
	 static String name;
	 static String city;
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Isha@12345");
		System.out.println("Database connect successfully");
		
		Scanner sn = new Scanner(System.in);
		while(true) {
			
		//we can right this way also line..to optimize the code
			//System.out.println("1.add \n 2.display \n 3.upadate \n 4.delete \n 5.exit \n enter your choice");
			
			
			System.out.println("1. Add Record ");
			System.out.println("2. Display Record ");
			System.out.println("3. Update Record ");
			System.out.println("4. Delete Record ");
			System.out.println("5. Exit Record ");
			System.out.println("Enter Your Choice : ");
			
			int choice = sn.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter id ");
				id=sn.nextInt();
				System.out.println("Enter name ");
				name=sn.next();
				System.out.println("Enter city ");
				city=sn.next();
				String s="insert into teacher(id,name,city) values(?,?,?)";
				
				PreparedStatement ps = con.prepareStatement(s);
				ps.setInt(1, id);
				ps.setString(2, name);
				ps.setString(3, city);
				ps.executeUpdate();
				ps.close();
				
				
			break;
			
			case 2:
				
			break;
			
			case 3:
				System.out.println("Enter id ");
				id=sn.nextInt();
				System.out.println("Enter name ");
				name=sn.next();
				String s1=("UPDATE teacher SET name=? WHERE id = ?");
				PreparedStatement ps1 = con.prepareStatement(s1);
				ps1.setString(1, "name");//1 is take sequnce number and we to update value putting there....
				ps1.setString(2, "id ");//1 means index or sequnce and 3 is a id posion...
				ps1.executeUpdate();
				//System.out.println("Record update");
			break;
			
			case 4:
				
				
			break;
			
			case 5:
				
				System.exit(0);
				
			break;
			
			default:
				
				System.out.println("It is wrong choice : ");
				
			break;
			
			}
		}
		

	}

}
