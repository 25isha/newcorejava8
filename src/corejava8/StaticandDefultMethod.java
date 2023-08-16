package corejava8;

interface One{
	void abstractmethod();
	default void display() {
		System.out.println("Interface 1.....");
	}
	static void display1() {
		System.out.println("Static method 1...");
	}
}

interface Two{
	void abstractmethod1();
	default void display2() {
		System.out.println("Interface 2.....");
	}
	
	static void display3() {
		System.out.println("Static method 2.....");
	}
}


public class StaticandDefultMethod implements One,Two {

	public static void main(String[] args) {
		StaticandDefultMethod sm=new StaticandDefultMethod();
		sm.display();
		sm.abstractmethod();
		One.display1();
		sm.display2();
		sm.abstractmethod1();
		Two.display3();
	}

	@Override
	public void abstractmethod() {
		System.out.println("Abstractmethod 1...");
		
	}

	@Override
	public void abstractmethod1() {
		System.out.println("Abstractmethod 2");
	}

}
