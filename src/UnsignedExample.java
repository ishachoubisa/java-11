public class UnsignedExample {
    public static void main(String[] args) {
        System.out.println("An integer has a range of "+Integer.MIN_VALUE+" to "+Integer.MAX_VALUE);
        int testInt = (int) (Integer.MAX_VALUE+3);
        System.out.println("Casting to an int, value = "+testInt);

        long l = (long)Integer.MAX_VALUE+3;
        System.out.println("What we expected(Integer.MAX_VALUE+3) to equal "+"by widening to long = "+l);

        String sInt = Integer.toUnsignedString(testInt);
        System.out.println("Integer.toUnsignedString value = "+sInt);

        int vInt = Integer.parseUnsignedInt(new String(""+((long)(Integer.MAX_VALUE)+3)));
        System.out.println("Integer.parseUnsignedInt value = " +vInt);
    }
}
