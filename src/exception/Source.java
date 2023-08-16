package exception;


/* class definitions:
 class MyException: Define exception
 class Source:
 method definitons:
 checkName(String firstName,String lastName)throw a user defined
exception if firstName and lastName is blank else return name
 return type: String
 visibility: public
 
 * checkName(String firstName,String lastName): throw a user defined exception if
firstName and lastName is blank else return name*/

import java.util.Scanner;

class MyException extends Exception {

	public MyException(String message) {
		super(message);
	}
}

public class Source {
	
	public	String checkName(String firstName, String lastName) throws MyException {
		if (firstName.isEmpty()) {
			throw new MyException("firstname is empty"); 
		} else if (lastName.isEmpty()) {
			throw new MyException("lastname is empty"); 
		} else {
			return firstName + lastName;
		} 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Source s = new Source();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first name");
		String fname = sc.nextLine();
		System.out.println("enter first name");
		String lname = sc.nextLine();

		String st;
		try {
			st = s.checkName(fname, lname);
			System.out.println(s);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		

	}

}


