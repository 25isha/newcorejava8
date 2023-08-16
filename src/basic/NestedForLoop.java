package basic;

public class NestedForLoop {

	public static void main(String[] args) {
		
		/*int weeks = 3;
	    int days = 7;

	    // outer loop prints weeks
	    for (int i = 1; i <= weeks; ++i) {
	      System.out.println("Week: " + i);

	      // inner loop prints days
	      for (int j = 1; j <= days; ++j) {
	        System.out.println("  Day: " + j);
	}

}*/
		 /*  //this print o/p:-***
							//**
							//*
	    for(int i=3;i>=1;i--) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("* ");
	    		//System.out.print("i ");
	    	}
	    	
	    	System.out.println();
	    }*/
		
		
		 /*  //this print o/p:-*
		  						**
		  						***					
		
		for(int i=1;i<=3;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print("* ");
	    		
	    	}
	    	
	    	System.out.println();
	    }*/
	    
		for(int i=1;i<=3;i++) {
	    	for(int j=1;j<=i;j++) {
	    		System.out.print(j );
	    		//System.out.print(i );
	    		
	    		
	    	}
	    	
	    	System.out.println();
	    }
		
		
	}
}