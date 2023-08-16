package collectonFramework;
import java.util.HashSet;
import java.util.Iterator;
public class IteratorEx {
	
	
	public static void main(String[] args)
	{
	HashSet countryName = new HashSet();

	countryName .add("India"); 
	countryName .add("United States"); 
	countryName .add("Brazil,"); 
	countryName .add("Zimbabwe");
	
	// line of code will remove element from HashSet 
	countryName .remove("Zimbabwe");
	Iterator iterator = countryName.iterator();
	while(iterator.hasNext()) {
	String countryofName =(String) iterator.next(); 
	System.out.println("Enter a name of country: "+countryofName);
	} 
	
	} 
	
}


