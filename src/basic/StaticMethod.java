package basic;

class Operation{
	void addition(int a, int b, int c) {
		System.out.println("Addition of 3 number:" +(a + b + c));
	}
	int divide (int a, int b) {
		return a / b;
	}
	int multiply (int a, int b) {
		return a * b;
	}
	int subtract(int a, int b) {
		return a - b;
	}
}

public class StaticMethod {

	public static void main(String[] args) {
		Operation o = new Operation();
		o.addition(1, 10, 30);
		o.divide(10, 20);
		o.multiply(15, 10);
		o.subtract(200, 25);
		System.out.println("Multiplication of 2 numbers: "+o.multiply(15, 10));
		System.out.println("Division of 2 numbers: "+o.divide(10, 20));
		System.out.println("subtract of 2 numbers: "+o.subtract(200, 25));
	}
}