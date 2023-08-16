package acessmodifiers;

class Demo{
	int a;
	public Demo(int a){
		this.a=a;
		System.out.println(a);
	}
	
	void display() {
		//int b=5;
		System.out.println(25);
	}
}
public class PrivateEx {
	private int a;
	
	
	public void test() {
		System.out.println(5);
	}

	public static void main(String[] args) {
		//PrivateEx p= new PrivateEx();
		Demo d= new Demo(20);
		d.display();
		//System.out.println(d.a);
		//p.a=2;
		
	}

}
