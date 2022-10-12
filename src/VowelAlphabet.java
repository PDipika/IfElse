

import java.util.Scanner;

public class VowelAlphabet {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("Input an alphabet : ");

        String input = scanner.next().toLowerCase();
        boolean Uppercase = input.charAt(0)>=65 && input.charAt(0)<=90;
        boolean Lowercase = input.charAt(0)>=97 && input.charAt(0)<=122;
        boolean Vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") ;
        if (input.length() > 1) {
            System.out.println("ERROR. Not a single character.");
        } else if (!(Uppercase || Lowercase)) {
            System.out.println("ERROR.Not a letter. Enter Uppercase or Lowercase letter.");
        } else if (Vowels){
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is consonant");
        }













    }
}
