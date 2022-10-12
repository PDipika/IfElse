

import java.util.Scanner;

public class GrossSalary {
static String employeeId;
static String employeeName;
static int basicSalary, HRA,DA,TA,PF,GrossSalary;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employeeId");
        employeeId = scanner.next();
        System.out.println("Enter employee Name");
        employeeName = scanner.next();
        System.out.println("Enter the basic salary of an employee");
        GrossSalary = scanner.nextInt();

        calculate();
    }
    public static void calculate(){
        HRA = 390;
        DA = 340;
        TA = 330;
        PF = 200;
         GrossSalary = (basicSalary + HRA + TA + DA) - PF;
        System.out.println(" employee Gross salary : " + GrossSalary +   "HRA : " + " n " + HRA + " n "  + "TA : " + TA + " n " + "DA :" + DA + " n " + "PF :" + PF);
    }



    }

