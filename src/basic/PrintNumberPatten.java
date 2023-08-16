package basic;

import java.util.Scanner;

public class PrintNumberPatten {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.print("Enter number of rows: ");
		   int rows = s.nextInt();
		 for (int i = 1; i <= 4; i++)
	        {
	            int n = 4;
	   
	            for (int j = 1; j<= n - i; j++) { System.out.print(" "); } for (int k = i; k >= 1; k--)
	            {
	                System.out.print(k);
	            }
	            for (int l = 2; l <= i; l++) { System.out.print(l); } System.out.println(); } for (int i = 3; i >= 1; i--)
	        {
	            int n = 3;
	   
	            for (int j = 0; j<= n - i; j++) { System.out.print(" "); } for (int k = i; k >= 1; k--)
	            {
	                System.out.print(k);
	            }
	            for (int l = 2; l <= i; l++)
	            {
	                System.out.print(l);
	            }
	   
	            System.out.println();
	        }
	}

}
