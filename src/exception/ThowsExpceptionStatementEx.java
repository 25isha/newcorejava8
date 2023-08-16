package exception;


public class ThowsExpceptionStatementEx {
	static void displayage(int age) throws Exception{
		if(age<25) {
			System.out.println("Don't enter less than age");
		}
		
		else {
			throw new ArithmeticException("dot now");
		}
	}
	

	public static void main(String[] args) throws Exception {
		displayage(24);
	}

}
