package inheritance;

import java.util.Scanner;

class Child{
	String name;
	public Child(String i) {
		name=i;
		System.out.println(name);
	}
}

class Parent extends Child{
	String role;
	String name;
	public Parent(String name,String role) {
		super(name);
		this.role=role;
		System.out.println(role);
		
	}
}



public class UsingContructorSingle {

	public static void main(String[] args) {
		//Parent p= new Parent("pasa", "harshu"); // we can directly print using this
			Scanner s= new Scanner(System.in);
			System.out.println("enter name");
			String name=s.nextLine();
			System.out.println("enter role");
			String role=s.nextLine();
		    Parent p= new Parent(name,role);

	}

}
