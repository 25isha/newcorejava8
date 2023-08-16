package collectonFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Learner {
	int lno;
	String lname, ldegree;

	public int getLno() {
		return lno;
	}

	public void setLno(int lno) {
		this.lno = lno;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLdegree() {
		return ldegree;
	}

	public void setLdegree(String ldegree) {
		this.ldegree = ldegree;
	}

	public Learner(int lno, String lname, String ldegree) {
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}

	@Override
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}

}

public class CrudOperationMenuDriven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Learner> l = new ArrayList<Learner>();
		Scanner s = new Scanner(System.in);
		int choice;
		do {
			System.out.println("1. Insert data ");
			System.out.println("2. Display data ");
			System.out.println("3. Search Recorde: ");
			System.out.println("4. Delete Recorde: ");
			System.out.println("5. Update Recorde: ");
			System.out.println("6. exit...: ");
			System.out.println("Enter your choice: ");
			choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.print("Enter lno ");
				int lno = s.nextInt();
				System.out.print("Enter lname ");
				String lname = s.next();
				System.out.print("Enter ldegree ");
				String ldegree = s.next();
				l.add(new Learner(lno, lname, ldegree));
				break;

			case 2:
				Iterator<Learner> i = l.iterator();
				while (i.hasNext()) {
					Learner le = i.next();
					System.out.println(le);
				}
				
			case 3:
				boolean found = false; // we define a boolen value.....
				System.out.print("Teacher Recorde to Search: ");
				lno=s.nextInt();
				System.out.println("--------------------------------------");
				i=l.iterator(); //upside we declare a interator so here only call object name..itoretor also one time define in program..
				while(i.hasNext()) {
					Learner le=i.next();
					if(le.getLno()== lno) { //if condition take to search recorde....
						System.out.println(le);
						found = true;
						
					}
				}
				
				if(!found) {
					System.out.println("Record not found: ");
				}
				break;
				
			case 4:
				found = false;
				if(!false) { //if condition take to search recorde....
					System.out.println("exit....");
					System.exit(0);
					
				}else if(!true) {
					System.out.println("not exit....");
				}else {
					System.out.println("exit sss...");
				}
				
				break;
			}
		} while (choice != 0);

	}
}
