package primitives;

public class IntegerClasses {

    public static void main(String[] args){
        assignBinary();
    }

    public static void assignBinary(){
        assignHex();
        // integral types
        // byte holds 8 bits
        byte byteOne = 0b101_1111;
        System.out.println(byteOne);

        //16 bits in a shor
        short shortOne = 0b0111_0000_1111_1010;
        System.out.println(shortOne);

        // 32 bits in on int
        int intOne = 0b0101;
        System.out.println(intOne);

        // 64 bit in a long
        long longOne = 0b1000_000_000_0000L;

        // how many bits are in a Long?
        System.out.println("Num bits in long: " + Long.SIZE);
        System.out.println("Min: " + (Long.MIN_VALUE));
        System.out.println("Max " + Long.MAX_VALUE);

    }

    public static void assignHex(){
        // integral types
        // byte holds 8 bits
        // declare a byte and assigned a hex value
        byte byteOne = 0x2A;
        // (2 X 16^1) + (10 x 16^0) =42
        System.out.println(byteOne);

        // short, int, long have a toBinaryString() static method
        // in their classes
        // declare a short and assign a hex value to it
        short num = 0x2FFF;
        // (2 * 16^3) + (15 * 16^2) + (15 * 16^1) + (15 * 16^0)
        // =
        // print out the decimal value
        System.out.println("Decimal Value: " + num);

        // 32 bits every 4 bits represents one hex digit (0 - F)
        int num2 = 0x206A_FFFF;
        System.out.println("Binary Value: " + Integer.toBinaryString(num2));
        System.out.println("Decimal Value: " + num2);
    }
}
