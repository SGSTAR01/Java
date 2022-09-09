package star;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scnObj = new Scanner(System.in);
        byte dataByte = scnObj.nextByte();
        System.out.println("Data as byte: " + dataByte);
        short dataShort = dataByte;
        System.out.println("Data as short: " + dataShort);
        char dataChar = (char) dataShort;
        System.out.println("Data as char: " + dataChar);
        int dataInt = dataChar;
        System.out.println("Data as int: " + dataInt);
        long dataLong = dataInt;
        System.out.println("Data as long: " + dataLong);
        float dataFloat = dataLong;
        System.out.println("Data as float: " + dataFloat);
        double dataDouble = dataFloat;
        System.out.println("Data as double: " + dataDouble);

        dataFloat = (float) dataDouble;
        System.out.println("Data as float: " + dataFloat);
        dataLong = (long) dataFloat;
        System.out.println("Data as long: " + dataLong);
        dataInt = (int) dataLong;
        System.out.println("Data as int: " + dataInt);
        dataChar = (char) dataInt;
        System.out.println("Data as char: " + dataChar);
        dataShort = (short) dataChar;
        System.out.println("Data as short: " + dataShort);

        System.out.println("Data as byte: " + (byte) dataByte);

        System.out.print("Enter a String: ");

        String input = scnObj.next();

        System.out.println("Length of String: " + input.length());
        System.out.println("String to UPPERCASE: " + input.toUpperCase());
        System.out.println("String to UPPERCASE: " + input.toLowerCase());

    }


}