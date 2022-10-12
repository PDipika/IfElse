
import java.util.Scanner;



public class NumberAlphabetSymbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch =scanner.next().charAt(0);
        //using character class
        if (Character.isAlphabetic(ch)){
            System.out.println(ch + "is A AlPHABET.");
        }
        else if(Character.isDigit(ch)){
            System.out.println(ch + "is A DIGIT.");
            }
        else{
            System.out.println(ch + "is A SPECIAL CHARACTER.");
        }







    }





}
