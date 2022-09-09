package star;
import java.util.Scanner;
import java.lang.String;
public class Second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Num1:");
        String num1 = input.nextLine();
        System.out.println("Enter Num2:");
        String num2 = input.nextLine();
        System.out.println(num1 + num2);
    }
}