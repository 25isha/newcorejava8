

//import java.util.stream.Stream;
//
//public class Soloex{
//  public static void main(String[] args) {
//    String input = "capgemini";
//    // Use a lambda expression to create a stream of characters from the input string
//    Stream<Character> stream = input.chars().mapToObj(c -> (char) c);
//    // Use the forEach method of the stream to print each character with a space
//    stream.forEach(c -> System.out.print(c + " "));
//  }
//}


import java.util.Scanner;
import java.util.stream.Stream;

public class Soloex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    Stream.of(input.split("")).forEach(s -> System.out.print(s + " "));
  }
}
