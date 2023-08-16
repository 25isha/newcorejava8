package basic;

public class ReverseNumberEx {

	public static void main(String[] args) {
		int rem;
		int sum = 0;
		int num = 0;
		while(num!=0)
		{
			 rem = num%10;
			 sum=sum+rem;
			 num=num/10;
			
		}
		
		System.out.println("sum:" +sum);
		
		int rev=0;
		while(num!=0);{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
	}
		System.out.println("Reverse Num:" +rev);
		
	}
	
}
