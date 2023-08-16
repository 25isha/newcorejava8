package designpatterns;


abstract class Doctor{
	String drname;
	void showDoctor()
	{
		System.out.println("This is doctor");
	}
}

class Patient extends Doctor
{
	String Patientname;
	void showPat()
	{
		System.out.println("This is Patientname");
	}
	
}
public class Updowncasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor d = new Patient();
		d.drname="Swapnil";
		System.out.println("This is doctor: "+d.drname);
		d.showDoctor();
		
		Doctor p = new Patient();							// UpCasting done implicitly child to parent.
		p.drname="Swap";
		System.out.println("This is doctor : "+p.drname);
		p.showDoctor();
		
		Patient p1 = (Patient) p;							// DwonCasting done explicitly parent to child
		p1.Patientname="madhuri";
		p1.drname="swapnil";
		p1.showDoctor();
		p1.showPat();
		System.out.println("This is doctor : "+p1.drname);
		System.out.println("This is PAtient : "+p1.Patientname);
		
	}

}

