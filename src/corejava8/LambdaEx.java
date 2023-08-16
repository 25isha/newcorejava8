package corejava8;

public class LambdaEx {
	
	interface abc{
		int add(int a, int b);
	}

	
	interface Evenodd{
		boolean even(int c);
	}
	
	
	interface Reverse{
		String rev(String s);
	}
	
	
	public static void main(String[] args) {
		
		abc ac=(int a,int b)->a+b;
		abc ac1=(int a,int b)->a*b;
		
		System.out.println("Multiplication: " +ac.add(2, 3));
		System.out.println("Sum is : "+ac.add(4, 7));
		
		Evenodd eo=(int c)->c%2==0;
		System.out.println(eo.even(4));
		
		
	}

}
