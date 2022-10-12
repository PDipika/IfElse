

import java.util.Scanner;
public class StudentsGrade {



    public static void main(String[] args) {

        System.out.println("Raj");
        System.out.println("rollNumber = 1");

        double maths, science, english, total, average;


        Scanner scanner = new Scanner(System.in);
        System.out.println("marks for maths = ");
        maths = scanner.nextInt();

        System.out.println("marks for science = ");
        science = scanner.nextInt();

        System.out.println("marks for english");
        english = scanner.nextInt();

        System.out.println("enter your total = ");
        System.out.println(total = maths + science + english);
        average = total *100/ 3;
        System.out.print(average);
        if(total >=80){
            System.out.println("Student got Grade A+");
        }else if(total >=60){
            System.out.println("student got Grade A ");
        } else if (total >=50)  {
            System.out.println("student got Grade B");
        } else if (total >=35) {
            System.out.println("student got Grade C");


        }
    }

}




















