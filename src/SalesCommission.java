import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SalesId : 123");
        System.out.println("SellersName : Anjali");
        System.out.println("sales amount = 50,000");
        int SalesAmount;
        SalesAmount = scanner.nextInt();
        System.out.println(SalesAmount);
        double amount=50000,commissionPercentage=35;

        double commission=(commissionPercentage/100)*amount;

        System.out.println("Commission amount="+commission);
      ;

        System.out.print("Enter amount:");
        System.out.print("Enter commissionPercentage:");
        System.out.println("Commission amount="+commission);


    }






    }
