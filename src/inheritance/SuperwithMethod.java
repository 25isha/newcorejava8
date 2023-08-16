package inheritance;

class dog{
	
	void display() {
		System.out.println("Dog is playing with ball");
	}
}

class cat extends dog{
	void displaycat() {
	super.display();
	
		System.out.println("Cat is eating milk");
	}
}
public class SuperwithMethod {

	public static void main(String[] args) {
//	 cat c =new cat();
//	 c.display();
//	 c.displaycat();
		
		dog myDog=new dog();
		myDog.display();

	}

}
