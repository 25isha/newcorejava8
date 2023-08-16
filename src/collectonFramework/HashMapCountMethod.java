package collectonFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapCountMethod {

public  static  Map<Character,Integer> countChars(char[] arr){
	Scanner s1=new Scanner(System.in);
	String st=s1.nextLine();
	char arry[] = st.toCharArray();
	int count=0;
	for(int i=0;i<arry.length;i++) {
		count=0;
		for (int j = 0; j < arry.length; j++) {
			if (arry[i]==arry[j]) {
				count++;
				
			}
			
		}
		
	}
	
	HashMap<Character, Integer> h1=new HashMap<Character, Integer>();

	System.out.println(h1);
	return null;
	
}
	public static void main(String[] args) {
		
		

	}

}
