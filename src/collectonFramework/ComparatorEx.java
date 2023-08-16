package collectonFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class NoteBook{
	int nPrice;
	int nPages;
	String nBrandName;
	public NoteBook(int nPrice, int nPages, String nBrandName) {
		super();
		this.nPrice = nPrice;
		this.nPages = nPages;
		this.nBrandName = nBrandName;
	}
	@Override
	public String toString() {
		return "NoteBook [nPrice=" + nPrice + ", nPages=" + nPages + ", nBrandName=" + nBrandName + "]";
	}
	
}

class SortbynBrandName implements Comparator<NoteBook>{


	@Override
	public int compare(NoteBook o1, NoteBook o2) {
		// TODO Auto-generated method stub
		return o1.nBrandName.compareTo(o2.nBrandName);
	}
	
}

class SortbynPages implements Comparator<NoteBook>{

	@Override
	public int compare(NoteBook o1, NoteBook o2) {
		
		return o1.nPages-o2.nPrice;
	}
	
}

class SortbynPrice implements Comparator<NoteBook>{

	@Override
	public int compare(NoteBook o1, NoteBook o2) {

		return o1.nPages-o2.nPrice;
	}
	
}
public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<NoteBook> ar=new ArrayList<NoteBook>();
		ar.add(new NoteBook(300, 200, "Sunder"));
		ar.add(new NoteBook(250, 150, "MText"));
		ar.add(new NoteBook(100, 50, "Bookmark"));
		//Collections.sort(ar, new SortbynBrandName());
		//Collections.sort(ar, new SortbynPages());
		Collections.sort(ar, new SortbynPrice());
		for(int i=0;i<ar.size();i++) {
			System.out.println("Enter a NoteBook Name:" +ar.get(i));
			
		}
		
		
	}

}
