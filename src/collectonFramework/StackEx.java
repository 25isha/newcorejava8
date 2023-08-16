package collectonFramework;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		//  Here we can get value true because in stack there is nothing value
		System.out.println("Stack is empty: "+s.isEmpty());
		
		// Here we push elemets..we can also use add method also 
		s.push(3);
		s.push(7);
		s.push(5);
		s.push(0);
		System.out.println("pushing elements: "+s);
		
		
		  
		// we can remove elements.
		s.pop();
		System.out.println("Pop a element:"+s);
		
		//peek() : This method retrieves, but does not remove, the head (first element) of this list. 
		s.peek();
		System.out.println(s.peek());
		
		//get a flase value in stack there inserting the value
		System.out.println("Stack is empty: "+s.isEmpty());
		
		System.out.println("Stack is empty: "+s.size());
		
		
		
	}

}
