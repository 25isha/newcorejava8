package basic;

public class ParametriesEx {

int a;
String b;

public ParametriesEx(int a, String b) {
	this.a=a;
	this.b=b;
}
public ParametriesEx(ParametriesEx p) {
	a=p.a;
	b=p.b;
	
}
public ParametriesEx() {  //copy constructor
	a='a';
	b="b";
	
}
	

  public void display() {
	System.out.println("variable : "+a);
	System.out.println("Variable : "+b);
}

public static void main(String[] args) {
	
	ParametriesEx p=new ParametriesEx(1 , "isha");
	p.display();
	
	ParametriesEx p1=new ParametriesEx(p);
	p1.display();
}
public int add(int i, int j) {
	// TODO Auto-generated method stub
	return j+i;
}

}