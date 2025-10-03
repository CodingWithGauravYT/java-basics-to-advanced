package dataType;

public class PrimitiveDataType {

    public static void main(String[] args) {
        byte b = 50;
        // b = b * 2; // compile error
        b = (byte) (b *2);
       System.out.println(b); // 100

        // integer division
        System.out.println(5/2); // 2 because of both integr operand
       System.out.println(5.0/2); // 2.5
        System.out.println(5/2.0); // 2.5

    //  System.out.println(0.1 + 0.2);
        long l = 10000000000000L;
        System.out.println(l);

        int a = 1000000000;
        int d = 1000000000;
        long c = a * d;

        System.out.println(c);

        double db = 0.1 + 0.2;
        System.out.println(db);

        char ch = 'A';
        System.out.println(ch +1);
        System.out.println((char) (ch +1));

        System.out.println((int) 'a'); // 97
        System.out.println('a'+ 'b'); // 97 +98 = 195
        System.out.println(""+'a'+ 'b'); //ab
    }
}