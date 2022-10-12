import java.util.Scanner;

public class PositiveNegativeZero {


    public static void main(String[] args) {
        int num;
        //scanner class to read value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any integer number here : ");
        num = scanner.nextInt();
        //check condition for positive, negative or zero
        if(num>0){
            System.out.println(num + " is POSITIVE NUMBER.");
        } else if (num<0){
            System.out.println(num + "is NEGATIVE NUMBER.");
        } else{
            System.out.println("IT'S ZERO.");
        }
    }
}
