package inheritance;

class Car{
	String name;
	public Car(String n) {
		name=n;
		System.out.println("Enter a name :" +name);
	}
}

class CarType extends Car{
	String name;
	String type;
	
	public CarType(String type, String name) {
		super(name);
		this.type=type;
		System.out.println("Enter a type :" +type);
	}
}

class CarModel extends CarType{
	String name;
	String type;
	String model;
	
	public CarModel(String name, String type,String model) {
		super(type, name);
		this.model=model;
		System.out.println("Enter model :" +model);
	}
}



public class UsingContructorMultilevel {     // main class 

	public static void main(String[] args) {
		CarModel c= new CarModel("audi ", "automatic ", "topmodel ");

	}

}
