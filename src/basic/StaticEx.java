package basic;

class student 
{
	static int fee;
	static String name="isha";
	

}

public class StaticEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			student.fee=100;
			System.out.println("fee:"+student.fee);
			student.name="harshu";
			System.out.println("name:"+student.name);
	}

}
