package filetopic;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

	public class DeserilizationEx { //these 3rd class create because of to read the data

		public static void main(String[] args) throws IOException, ClassNotFoundException {
		   FileInputStream fis = new FileInputStream("BikeData.txt");
		   ObjectInputStream ios= new ObjectInputStream(fis);
		   BikeEx b=null;
		   b=(BikeEx) ios.readObject();
		   System.out.println(b.bNo+" "+b.bcolor+" "+b.bName );
		   b.display();
		   fis.close();
		   ios.close();
				
			

		}

	}



