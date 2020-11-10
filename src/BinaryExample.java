public class BinaryExample {
    public static void main(String[] args) {
        byte byte1 = (byte) 0b01111111;
        byte byte2 = (byte) 0b10000000;
        byte byte3 = (byte) 0b00100001;

        short short1 = (short) 0b10100001_01000101;

        int int1 = 0b10100001_01000101_10100001_01000101;

        int int2 = 0b101;
        int int3 = 0B101;

        int int4 = 0B00000000_00000000_00000000_00000101;

        long long1 = 0b1010000101000101101000010100010110100001010001011010000101000101L;
        long long2 = 0b0000000_000000000_00000000_00000000_00000000_00000000_00000000_00000101;

        System.out.println("byte1=" +byte1);
        System.out.println("byte2=" +byte2);
        System.out.println("byte3=" +byte3);

        System.out.println("short1=" +short1);

        System.out.println("int1=" +int1);
        System.out.println("int2=" +int2);
        System.out.println("int3=" +int3);
        System.out.println("int4=" +int4);

        System.out.println("long1=" +long1);
        System.out.println("long2=" +long2);
    }
}
