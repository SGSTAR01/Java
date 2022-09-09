package star;

public class Typecast {
    public static void main(String[] args) {
        System.out.println("Widening Casting");
        byte asByte = 10;
        System.out.println("Data as byte:"+asByte);
        short asShort = asByte;
        System.out.println("Data as short:"+asShort);
        char asChar = (char) asShort;
        System.out.println("Data as char:"+asChar);
        int asInt = asChar;
        System.out.println("Data as int:"+asInt);
        long asLong = asInt;
        System.out.println("Data as long:"+asLong);
        float asFloat = asLong;
        System.out.println("Data as float:"+asFloat);
        double asDouble = asFloat;
        System.out.println("Data as double:"+asDouble);

        System.out.println("Narrowing Casting");
        double asdouble = 5;
        float asfloat = (float)asdouble;
        long aslong = (long) asfloat;
        int asint = (int) aslong;
        char aschar = (char) asint;
        short asshort = (short) aschar;
        byte asbyte = (byte) asshort;
        System.out.println("Data as Double:"+asdouble);
        System.out.println("Data as Float:"+asfloat);
        System.out.println("Data as Long:"+aslong);
        System.out.println("Data as Int:"+asint);
        System.out.println("Data as Short:"+asshort);
        System.out.println("Data as Char:"+aschar);

    }
}
