package exception;

public class ClassNotFoundEx {

	public static void main(String[] args) {
		try {
			Class.forName("basic.sdc");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Class not found");
			
		}
		
		catch (ClassNotFoundException c) {
			//System.out.println(c);
			c.printStackTrace();
		}
	}

}
