import java.util.Scanner;
public class CarDistanceCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the first time interval in seconds:");
int interval1 = scanner.nextInt();
System.out.println("Enter the second time interval in seconds:");
int interval2 = scanner.nextInt();
double initialVelocity = 36 * 1000 / 3600.0; // Convert km/hr to m/s
double acceleration = 5;
double distance1 = calculateDistance(initialVelocity, acceleration,interval1);
double distance2 = calculateDistance(initialVelocity, acceleration, 
interval2);
System.out.println("Distance travelled in the first interval: " + distance1 + 
" meters");
System.out.println("Distance travelled in the second interval: " + distance2 
+ " meters");
scanner.close();
}
public static double calculateDistance(double initialVelocity, double 
acceleration, int time) {
double distance = initialVelocity * time + (0.5 * acceleration * time * 
time);
return distance;
}
}
