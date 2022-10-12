import java.util.Scanner;

public class CalculationSymbol {
    public static void main(String[] args) {
        double num2;
        Scanner scanner;
        scanner = new Scanner(System.in);
        System.out.println("Enter first number here : ");
        double num1 = scanner.nextDouble();

        //using data type double so we can enter integer as well as floating point value

        System.out.println("Enter second number here : ");
        num2 = scanner.nextDouble();
        System.out.println("Enter an operator ( +, -, *, /) : ");
        char operator = scanner.next().charAt(0);
        scanner.close();
        double output;
        switch (operator) {
            case '+':
                output = num1 + num2;
                break;
            case '-':
                output = num1 - num2;
                break;
            case '*':
                output = num1 * num2;
                break;
            case '/':
                output = num1 / num2;
                break;
            default:
                System.out.println("you have entered wrong operator");
                return;
        }

        System.out.println(num1 + " " + operator + " " + num2 + ":" + output);


    }

    private static double getaDouble(Scanner scanner) {
        double num1 = scanner.nextDouble();
        return num1;
    }
}

