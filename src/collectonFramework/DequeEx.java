package collectonFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeEx {

	public static void main(String[] args) {
		Deque<Integer> d=new ArrayDeque<Integer>();
		d.offer(3);
		d.offerFirst(2); // print 1 first than 3 and last 7
		d.offerLast(7);
		System.out.println(d);
		int i=d.pollFirst();
		System.out.println(d); // remove the element
		System.out.println(i);
		
		
		

	}

}
