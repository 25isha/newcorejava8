package corejava8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class ClgStudent1{
	int clgid;
	String name;
	int rollno;
	String sub;
	
	
	public ClgStudent1(int clgid, String name, int rollno, String sub) {
		super();
		this.clgid = clgid;
		this.name = name;
		this.rollno = rollno;
		this.sub = sub;
	}


	public void ClgStudent(int clgid2, String name2, int rollno2, String sub2) {
		// TODO Auto-generated constructor stub
	}


	public int getClgid() {
		return clgid;
	}


	public void setClgid(int clgid) {
		this.clgid = clgid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}


	@Override
	public String toString() {
		return "Student [clgid=" + clgid + ", name=" + name + ", rollno=" + rollno + ", sub=" + sub + "]";
	}
	
	
}

public class streamAPI {

	public static void main(String[] args) {
		ArrayList<ClgStudent1> al=new ArrayList<ClgStudent1>();
		al.add(new ClgStudent1(60, "isha", 35, "df"));
		al.add(new ClgStudent1(70, "ishu", 31, "bf"));
		al.add(new ClgStudent1(30, "harshu", 40, "dc"));
		al.add(new ClgStudent1(20, "mau", 39, "css"));
		
		System.out.println(al);
		
		Long count=al.stream().count();
		System.out.println("total clgstudent: "+count);
		
		long i=al.stream().filter(a->a.getName().startsWith("i")).count();
		System.out.println("Count number which staring firt latter i: "+i);
		
		//List<String> s=new al.stream().filter(a->a.getName().startwith("i"));
		
		Object max_rollno=al.stream().collect(Collectors.maxBy(Comparator.comparingDouble(a->a.rollno)));
		System.out.println("maximun highest roll no: "+max_rollno);
		
		Object min_rollno=al.stream().collect(Collectors.minBy(Comparator.comparingDouble(a->a.rollno)));
		System.out.println("maximun loweste roll no: "+min_rollno);
		
		double avg_rollno=al.stream().collect(Collectors.averagingDouble(a->a.rollno));
		System.out.println("Average rollno: "+avg_rollno);
	}

}
