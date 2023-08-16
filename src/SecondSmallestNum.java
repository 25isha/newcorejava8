	import java.util.Arrays;
	import java.util.Scanner;
public class SecondSmallestNum {


		public int getSecondSmallestNum(int[]arr) {
			Arrays.sort(arr);
			return arr[1];	
		}

		public static void main(String[] args) {
			SecondSmallestNum s=new SecondSmallestNum();
			
			String i;
			String[]arr;
			int[] a;
			Scanner sr=new Scanner(System.in);
			i= sr.nextLine();
			i= i.replaceAll("\\sr+", "");
			arr = i.split(", ");
			a= new int [arr.length];
			for (int j=0; j<a.length; j++) {
				a[j]= Integer.parseInt(arr[j]);
				
			}
			int result = s.getSecondSmallestNum(a);
			System.out.println(result);
				

		}

	}

