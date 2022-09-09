package star;
import java.util.Scanner;
public class Ifelse {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int num1= s.nextInt();
        System.out.println("Enter 2nd Number:");
        int num2= s.nextInt();

        if (num1>num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else if (num1<num2){
            System.out.println(num1+" is less than "+num2);
        }
        else{
            System.out.println(num1+" and "+num2+" are equal");
        }
    }
}
