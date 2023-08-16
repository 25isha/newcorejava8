package inheritance;

class Animal{
	String type="Domestic";
	void display() {
		System.out.println("Animal Type: "+type);
	}
}

class AnimalName extends Animal{
	String name="Cow";
	void displayname() {
		System.out.println("Enter Name: "+name);
	}
}

class CowBaby extends Animal{
	String babyname="Small Cow";
	void displaybabyname() {
		System.out.println("Display Baby Name: " +babyname);
	}
}


public class HierachicalInheritance {

	public static void main(String[] args) {
		AnimalName a= new AnimalName();
		a.display();
		a.displayname();
		CowBaby c= new CowBaby();
		c.displaybabyname();
	}

}
