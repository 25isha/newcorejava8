package filetopic;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import basic.StudentEx;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		BikeEx be=new BikeEx();
		be.bNo=23;
		be.bcolor="Black";
		be.bName="Hero Honda";
		FileOutputStream fos = new FileOutputStream("BikeData.txt"); // data can write in file
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(be);
		fos.close();
		oos.close();
		System.out.println("File created");
		
	}

}
