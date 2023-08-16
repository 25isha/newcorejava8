package inheritance;


class Laptop
{
	String item="Lenovo";
	void display() {
		System.out.println(item);
	}
}

class Lenovo extends Laptop{
	String name="Lenovo";
	void displayname() {
		System.out.println(name);
	}
}

class LenovoModel extends Lenovo{
	String model="TS";
	void displaymodel() {
		System.out.println(model);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		
		LenovoModel l=new LenovoModel();
		l.display();
		l.displayname();
		l.displaymodel();

	}

}
