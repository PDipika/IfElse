import java.util.Random;
import java.util.Scanner;

public class LeapYear
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter any year :");

        int year = scanner.nextInt();
        //if the year is divided by 4
        if ((year % 4 == 0) && (year % 100 == 0)) {
            System.out.println(" year " + " is a leap year.");
        }
        else {
            System.out.println(" year " + " is not a leap year." );
            }
        }
    }