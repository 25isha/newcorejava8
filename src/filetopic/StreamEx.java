package filetopic;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamEx {

	public static void main(String[] args) throws IOException{
		
		//using outputstream we can write a contain in file
		FileOutputStream f = new FileOutputStream("D:/TextFile"); 
		String s="my self isha gaikawad...i completed my BE in computer engg form MGMCET college nai mumabi";
		byte by[]=s.getBytes();
		f.write(by);
		System.out.println("File Create Sucessfully");
	
		//using fileinputsream we can read the file
		FileInputStream f1 = new FileInputStream("D:/TextFile"); 
		System.out.println("Read the File");
		int i = f1.read();
		while (i !=-1) {  //-1 use beacuse end of file
			System.out.print((char)i); //here use typecasting because we want value in word typecasting syntax((char)i)
			i=f1.read();
		}
	}

}
