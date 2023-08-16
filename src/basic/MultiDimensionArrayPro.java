package basic;

public class MultiDimensionArrayPro {

	public static void main(String[] args) {
			int b[][] = {{1,2,3,4,5},{6,7,8,9,10}};
			int cloneb[][] = b.clone();
				System.out.println(b == cloneb);
			System.out.println(b[0] == cloneb[0]);
			System.out.println(b [1]== cloneb[1]);
			
			for(int i=0;i<b.length; i++) {
				for (int j=0; j<5; j++) {
					System.out.println("=>"+ cloneb[i][j]);
				}
			}
			
			
			for(int i=0;i<b.length; i++) {
				for (int j=0; j<5; j++) {
					System.out.println("=>"+ cloneb[i][j]+"");
				}
			}
	}

}
