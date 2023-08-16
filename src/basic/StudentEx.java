package basic;

// Contrutor program//

public class StudentEx {
	
	int rollno=10; //valuse asing default
	
	String name="doll"; // default value asing

    public StudentEx (int rollno, String name) {
    	this.rollno=rollno;
    	this.name=name;
    }
    public StudentEx(StudentEx s) {
    	rollno=s.rollno;
    	name=s.name;
    	
    }
	public StudentEx() {//copy contructor
		rollno=rollno;
		name=name;
	}
	void display() {
		System.out.println("Student rollno:" +rollno);
		System.out.println("Student name: " +name);
	}

	public static void main(String[] args) {

		StudentEx s= new StudentEx();
		s.rollno=1;
		s.name="isha";
		s.display();
		StudentEx s1= new StudentEx();//defalut contructor
		s1.display();
		StudentEx s2= new StudentEx(13,"pasa");//parametries contructor
		s2.display();
		StudentEx s3= new StudentEx(s2);//copy contructor
		s3.display();
		
		
	}

}
