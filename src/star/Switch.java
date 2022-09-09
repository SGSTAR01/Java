package star;

import java.util.Scanner;
public class Switch {
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        while (true) {
            System.out.println("Enter Two Numbers:");
            float num1=s.nextInt();
            float num2=s.nextInt();
            System.out.println("Enter Your Choice:");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("0.Exit");
            int choice=s.nextInt();
            switch (choice) {
                case 1 -> {
                    float result1 = num1 + num2;
                    System.out.println("Addition of " + num1 + " and " + num2 + " is " + result1);
                }
                case 2 -> {
                    float result2 = num1 - num2;
                    System.out.println("Subtraction of " + num1 + " and " + num2 + " is " + result2);
                }
                case 3 -> {
                    float result3 = num1 * num2;
                    System.out.println("Multiplication of " + num1 + "  and " + num2 + " is " + result3);
                }
                case 4 -> {
                    float result4 = num1 / num2;
                    System.out.println("Division of " + num1 + " and " + num2 + " is " + result4);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Wrong Choice!!!!!");
            }

        }
    }
}
