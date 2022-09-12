package star;
import java.util.Scanner;
public class Methodjava {
    static  int sum(int num1,int num2){
        return num1+num2;
    }
    static  int subtract(int num1,int num2){
        return num1-num2;
    }
    static  int multiply(int num1,int num2){
        return num1*num2;
    }
    static  int divide(int num1,int num2){
        return num1/num2;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int x=input.nextInt();
        System.out.println("Enter 2nd Number:");
        int y=input.nextInt();
        System.out.println("Addition:"+sum(x,y));
        System.out.println("Subtraction:"+subtract(x,y));
        System.out.println("Multiplication:"+multiply(x,y));
        System.out.println("Division:"+divide(x,y));
    }
}
