public class BinaryOperatorExample {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;
        int f = 6;
        int result = a + e * b - f / c % b;
        System.out.println("result for (a+e*b-f/c%b) = " + result);

        System.out.println("result for (11%10) = " + (11 % 10));
        System.out.println("Modulus example where integer divisor" + "> integer divident");
        for (int i = 0; i <= 9; i += 3) {
            for (int j = 10; j <= 100; j += 30) {
                System.out.println("i(" + i + ")%j(" + j + ") = " + (i % j));
            }
        }

        System.out.println("Modulus example where double divisor" + "> double divident");
        for (double i = 0.5; i <= 0.55; i += 0.025) {
            for (double j = 10; j <= 100; j += 30.57) {
                System.out.println("i("+ i +")%j("+ j +") ="+ (i % j));
            }
        }

        try{
            System.out.println("Modulus with zero divisor (10%0) = "+ (10%0));
        }catch(Exception ex){
            ex.printStackTrace(System.out);
        }

        try{
            System.out.println("Modulus with zero divisor (10.0%0) = "+ (10.0%0.0));
        }catch(Exception ex){
            ex.printStackTrace(System.out);
        }

        System.out.println("--- Shift Operators ---");
        System.out.println("Result of left shift(00000001 << 2) = "+ String.format("%8s",Integer.toBinaryString(0b00000001 << 2)).replace(' ','0'));

        System.out.println("Result of right shift(10001000 >> 3) = "+ String.format("%8s",Integer.toBinaryString(0b10001000 >> 3)).replace(' ','0'));

        System.out.println("result of unsigned right shift (" + "10000010_00000010_00000010_00000010 >>> 1 ) = "+ String.format("%32s",Integer.toBinaryString(0b10000010_00000010_00000010_00000010 >>> 1)).replace(' ','0'));

        System.out.println("result of signed right shift (" + "10000010_00000010_00000010_00000010 >> 1 ) = "+String.format("%32s",Integer.toBinaryString(0b10000010_00000010_00000010_00000010 >> 1)).replace(' ','0') );
    }
}
