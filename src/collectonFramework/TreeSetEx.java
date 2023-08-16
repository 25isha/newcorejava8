package collectonFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {
	
		public static void main(String[] args) {
			TreeSet<String> c = new TreeSet<>();
			c.add("Murud Janjira");
			c.add("Mumbai");
			c.add("Navi mumbai");
			c.add("Vashi");
			c.remove("Vashi");
			c.add("Mumbai");
			//c.add(null);   // this not take null value giving exceptionpointer error
			System.out.println(c);
			System.out.println("Retrive data using treeset");
			Iterator iterator = c.descendingIterator();
			while (iterator.hasNext()) {
				String nameOfCity = (String) iterator.next();
				System.out.println(nameOfCity);
			}
		}
}


