package basic;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class MethodOverloading {
	
	private static void display(int q) {
		
		System.out.println("Display:"+q);
	}

		private static void display(int q1, int q2) {
		
		System.out.printf("Display:"+q1,q2);
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a value first variable");
		
		s.nextInt();
		
		System.out.println("enter a value both q1 and q2 variable");
		s.nextInt();
		
	}

}
