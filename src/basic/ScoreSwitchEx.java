package basic;

import java.util.Scanner;
public class ScoreSwitchEx {

	public  String printGrade(int score) {
		if(score<0 && score>100) {
			return "invalid";
		}
		
		switch (score/10) {
		case 10:
			return "a+";
			
		case 9:
			return "a";
		default: return "f";
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your score");

		int score=s.nextInt();
		ScoreSwitchEx se=new ScoreSwitchEx();
		String result = new String();
		System.out.println("my grade:"+ result); 

	

	
	
	
	// Using static method....................
	/*public static String printGrade(int score) {
		if(score<0 && score>100) {
			return "invalid";
		}
		
		switch (score/10) {
		case 10:
			return "a+";
			
		case 9:
			return "a";
		default: return "f";
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter your score");

		int score=s.nextInt();
//MarksheetSwitch m=new MarksheetSwitch();

		String result= printGrade(score);
		System.out.println("my grade:"+ result); */

	}

}