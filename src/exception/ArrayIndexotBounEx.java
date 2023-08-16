package exception;

public class ArrayIndexotBounEx {

	public static void main(String[] args) {
		
		
			try
			{
				int[] numbers = {1, 2, 3}; 
				System.out.println(numbers[1]);
			}
			
			catch (Exception e) {
				System.out.println("Some Error in code.");
			}
			finally{
			}
		
			System.out.println("The finally statement lets you execute code, after try...catch, "
			+ "regardless of the result");
	}

}
