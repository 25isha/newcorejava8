package basic;

public class SingleArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {0,1,2,3,4,5,6,7,8,9};
		int cloneArray[]= intArray.clone();
		System.out.println(intArray);
		System.out.println(cloneArray);
		System.out.println(intArray==cloneArray);
		for (int i=0;i<cloneArray.length;i++)
			System.out.println (cloneArray[i]);
		
		
		
	}

}

