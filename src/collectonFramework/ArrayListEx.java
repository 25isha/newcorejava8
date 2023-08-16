package collectonFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("isha");
		a1.add("harshu");
		a1.add(" "); // Default value
		a1.set(2, "isahuuu");
		System.out.println("Enter a name:" +a1);
		
		ArrayList<String> a2=new ArrayList<>();
		a1.add("isha");
		a1.add("harshu");
		a1.addAll(a2);
		
		
		System.out.println("Exchange the object value:" +a1);

		//array using integer
		ArrayList<Integer> l=new ArrayList<>();
		l.add(2);
		l.add(6);
		l.add(4);
		System.out.println("Create a List:" +l);
		
		ArrayList<Integer> list = new ArrayList<>();//
		Collections.addAll(list, 1, 76, 7, 0, 2);
		System.out.println("Enter a list:" +list);
		Collections.sort(list);
		System.out.println("Sorting list in sequence:" +list);
		System.out.println("Index of list: "+list.indexOf(7));
		System.out.println("Index of list: "+list.lastIndexOf(7));
		
		
		
		//we can pass string value this way also
		ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("rajesh", "anisha"));
		System.out.println("Enter a name:" +arrayList);
	
	}

}
