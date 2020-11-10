import org.w3c.dom.ls.LSOutput;

public class StringBuilderExtras {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        builder.append("ABCD                 ");
        System.out.println("Original Value of builder = *" + builder + "*");
        System.out.println("Length of builder = "+ builder.length());
        System.out.println("Capacity of builder = "+builder.capacity());

        builder.trimToSize();
        System.out.println("Current value of builder = *"+builder+"*");
        System.out.println("Length of builder = "+builder.length());
        System.out.println("Capacity of builder = "+builder.capacity());

        builder.replace(0,builder.length(), builder.toString().strip());
        System.out.println("Next value of builder = *"+builder+"*");
        System.out.println("Length of builder = "+builder.length());
        System.out.println("Capacity of builder = "+builder.capacity());

        builder.append(" just more text because we need more text");
        char[] myCharacterArray1 = new char[10];
        char[] myCharacterArray2 = new char[10];

        builder.toString().getChars(20,27,myCharacterArray1,0);
        builder.getChars(20,27,myCharacterArray2,0);
        System.out.println("myCharacterArray1 = "+java.util.Arrays.toString(myCharacterArray1));
        System.out.println("myCharacterArray2 = "+java.util.Arrays.toString(myCharacterArray2));


        char[] myCharacterArray3 = new char[builder.length()];
        char[] myCharacterArray4 = new char[builder.length()];

        builder.toString().getChars(20,21,myCharacterArray3,0);
        builder.getChars(20,21,myCharacterArray4,0);
        System.out.println("myCharacterArray3 = "+java.util.Arrays.toString(myCharacterArray3));
        System.out.println("myCharacterArray4 = "+java.util.Arrays.toString(myCharacterArray4));

        char[] myCharacterArray5 = new char[10];
        char[] myCharacterArray6 = new char[10];

        builder.toString().getChars(20,27,myCharacterArray5,3);
        builder.getChars(20,27,myCharacterArray6,3);
        System.out.println("myCharacterArray5 = "+java.util.Arrays.toString(myCharacterArray5));
        System.out.println("myCharacterArray6 = "+java.util.Arrays.toString(myCharacterArray6));

//        char[] myCharacterArray7 = new char[5];
//        char[] myCharacterArray8 = new char[5];
//        builder.toString().getChars(20,27,myCharacterArray7,3);
//        builder.getChars(20,27,myCharacterArray8,3);
//        System.out.println("myCharacterArrays7 = "+java.util.Arrays.toString(myCharacterArray7));
//        System.out.println("myCharacterArrays8 = "+java.util.Arrays.toString(myCharacterArray8));

    }
}
