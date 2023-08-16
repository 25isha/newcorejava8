
public class DiagonalEx {

	public static void main(String arr [] ) {
		
		int [] [] abc= {{1,2,3}, {4,5,6},{7,8,9}};
		int sum=0;
		for(int i=0;i<abc.length;i++) {
			System.out.println(i);
			for(int j=0;j<abc.length;j++) {
				System.out.println(j);
				if(i==j) {
					sum+=abc [i][j];
				}
			}
			
		}
		
		System.out.println(sum);
	}

}
