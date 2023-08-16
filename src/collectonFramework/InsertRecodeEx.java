package collectonFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

class Teacher{
	int tId;
	String name;
	String tSub;
	
	
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String gettSub() {
		return tSub;
	}
	public void settSub(String tSub) {
		this.tSub = tSub;
	}
	public Teacher(int tId, String name, String tSub) {
		super();
		this.tId = tId;
		name = name;
		this.tSub = tSub;
	}
	@Override
	public String toString() {
		return "Teacher [tId=" + tId + ", Name=" + name + ", tSub=" + tSub + "]";
	}
	
}
public class InsertRecodeEx {

	public static void main(String[] args) {
		ArrayList<Teacher> alt= new ArrayList<Teacher>();
		Scanner s=new Scanner(System.in);
		//Scanner sr=new Scanner(System.in);
		int recorde;
		do {
			System.out.println("1. Insert Recorde: ");
			System.out.println("2. Display Recorde: ");
			System.out.println("3. Search Recorde: ");
			System.out.println("4. Delete Recorde: ");
			System.out.println("5. Update Recorde: ");
			System.out.println("6. exit!....");
			System.out.println("Enter Your Choice: ");
			recorde=s.nextInt();
switch(recorde) {
			
			case 1:
				System.out.println("Enter Id: ");
				int tId=s.nextInt();
				System.out.println("Enter name: ");
				String name=s.next();
				System.out.println("Enter subject: ");
				String tSub=s.next();
				alt.add(new Teacher(tId, name, tSub));
				break;
				
			case 2:
				System.out.println("--------------------------------------");
				Iterator<Teacher> i=alt.iterator();
				while(i.hasNext()) {
					Teacher le=i.next();
					System.out.println(le);
				}
				System.out.println("--------------------------------------");
				break;
				
			case 3:
				boolean found = false; // we define a boolen value.....
				System.out.print("Teacher Recorde to Search: ");
				tId=s.nextInt();
				System.out.println("--------------------------------------");
				i=alt.iterator(); //upside we declare a interator so here only call object name..itoretor also one time define in program..
				while(i.hasNext()) {
					Teacher le=i.next();
					if(le.gettId() == tId) { //if condition take to search recorde....
						System.out.println(le);
						found = true;
						
					}
				}
				
				if(!found) {
					System.out.println("Record not found: ");
				}
				System.out.println("--------------------------------------");
				break;
			
			case 4:
				//not take boolen because of upside we declare in pro only one time bool keyword want to define.. 
				found = false; // here we take false or true condition because of to see record is delete or not
				System.out.print("Teacher Recorde to Delete: ");
				tId=s.nextInt();
				System.out.println("--------------------------------------");
				i=alt.iterator();
				while(i.hasNext()) {
					Teacher le=i.next();
					if(le.gettId() == tId) {
						i.remove();
						found = true;
						
					}
				}
				
				if(!found) {
					System.out.println("Record not found: ");
				}else {
					System.out.println("Record Delete successfully......");
				}
				System.out.println("--------------------------------------");
				break;
				
			case 5:
				found = false;
				System.out.print("Teacher Recorde to Update Type here Id Number Which Record do you have to update: ");
				tId=s.nextInt();
				System.out.println("--------------------------------------");
				ListIterator<Teacher> li = alt.listIterator(); //this define because we want to update a new recorde...
				while(li.hasNext()) {
					Teacher le=li.next();
					if(le.gettId() == tId) {
						System.out.println("Enter new name: ");
						name=s.next();
						
						System.out.println("Enter new subject: ");
						tSub=s.next();
						li.set(new Teacher(tId, name, tSub));
						found = true;
						
					}
				}
				
				if(!found) {
					System.out.println("Record not found: ");
				}else {
					System.out.println("Record Update successfully......");
				}
				System.out.println("--------------------------------------");
				
				break;
				
			case 6:
				System.exit(0);
				break;
		}
		
	}while(recorde!=0);

	}
}
