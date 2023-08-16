package inheritance;

abstract class Vehicle1{ //form here start
	
	public Vehicle1() { // using contructor

		System.out.println("Vehicle Constructor"); //this also contructor
	}
	
	abstract void show();    // here we can continue with abstract class code
	String a="isha";
	void displaya() {
		System.out.println(a);
	}
	void vehicleBrand() {    //This is my non Abstract method 
		System.out.println("Non abstract method");
	}
	public  static void display() {            //here we put static method
		System.out.println("Static display method");
	}
	
	
	
}
class Bike extends Vehicle1{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Bike");
	}
	
}
class Car1 extends Vehicle1{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("car");
	}
	
}
public class AbstractClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//       Vehicle1 v=new Car();
//        v.show();
        Vehicle1 c=new Bike(); //like this way we can print abstract class method
        c.show();
        c.vehicleBrand();
        Car1.display();
        Bike.display();
        Vehicle1.display();
        c.displaya();
       
        
        
       // Vehicle1 v =new Vehicle1(); /// here we getting error because of we can not create object in abstract class
        	
			
			
	}

}
