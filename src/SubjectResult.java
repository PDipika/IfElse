import java.util.Scanner;

public class SubjectResult {
    static int marks;
    public static void main(String[] args) {
        System.out.println("enter your marks = ");
        Scanner scanner = new Scanner(System.in);
        marks = scanner.nextInt();

        if ( marks>= 50) {
            System.out.println("pass");

        } else {
            System.out.println("fail");
        }
    }














}
