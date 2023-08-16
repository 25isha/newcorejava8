package inheritance;

class Student{
	String name="isha";
	void display() {
		System.out.println(name);
		
	}
}

class Teacher extends Student{
	String role="Teaching";
	void displayrole() {
		System.out.println(role);
	}
}


public class SingleInheritanceEx {

	public static void main(String[] args) {
		Teacher t= new Teacher();
		t.display();
		t.displayrole();
		

	}

}
