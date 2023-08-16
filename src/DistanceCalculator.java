//import the Scanner class to take user input
import java.util.Scanner;

//define the class name
public class DistanceCalculator {

  //define the main method
  public static void main(String[] args) {

    //create a Scanner object to read user input
    Scanner sc = new Scanner(System.in);

    //declare and initialize the variables for initial velocity, acceleration and time intervals
    int u = 36; //initial velocity in km/hr
    int a = 5; //acceleration in m/s2
    int t1 = sc.nextInt(); //first time interval in seconds
    int t2 = sc.nextInt(); //second time interval in seconds

    //convert the initial velocity from km/hr to m/s by multiplying by 5/18
    u = u * 5 / 18;

    //calculate the distance travelled for the first time interval using the formula
    int d1 = u * t1 + (a * t1 * t1) / 2;

    //calculate the distance travelled for the second time interval using the formula
    int d2 = u * t2 + (a * t2 * t2) / 2;

    //print the distances in meters
    System.out.println(d1);
    System.out.println(d2);

    //close the Scanner object
    sc.close();
  }
}

