
import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number here:");
      //check if the number is Even or Odd
        int number = scanner.nextInt();
        String EvenOdd = (number % 2 == 0) ? "Even" : "odd";

        System.out.println(number + " is " + EvenOdd);

    }
}
