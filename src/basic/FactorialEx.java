package basic;

public class FactorialEx {

	//private static final int i = 0;

	public static void main(String[] args) {
		
		int num=3;
		int fact=1;
		for(int i=1;i<=num;i++) {
			
			fact*=i;
		}
		
		System.out.println(+fact);
		int num1=3;
		int fact1=1;
		int rem=num1+fact1;
		while(num1<=fact1) {
			System.out.println(+rem);
			int i = 0;
			i++;
		}
	}

}
