package collectonFramework;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(1, "isha");
		h.put(2, "harshu");
		h.replace(1, "ipo");  //it replace the string value
		h.putIfAbsent(1, "ha");
		System.out.println(h);
		
	
	}

}
