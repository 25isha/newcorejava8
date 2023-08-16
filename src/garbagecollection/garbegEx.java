package garbagecollection;

public class garbegEx {


	    public void finalize()
	    {
	        System.out.println ("Garbage Collection performed by JVM");
	    }
	    public static void main (String args[])
	    {
	    	garbegEx s1 = new garbegEx();
	    	garbegEx s2 = new garbegEx();
	    	s1 = null; //here we give null value so message will be print
	    	s2 = null;
	        System.gc();
	    }
	
}


