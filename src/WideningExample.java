public class WideningExample {
    public static void main(String[] args)
    {
        char myChar = 'a';

        byte myByte = 0;
        short myShort;

        int myInt = 0;
        float myFloat = 0.0f;
        double myDouble = 0.0;

        long myLong = 0;
        myDouble = 0.0f;

        myDouble=myFloat=myLong=myInt=myShort=myByte;

        System.out.println("Happy Widening");

        myByte = 'a';

//        myChar = myByte;
//
//        myShort = myChar;
//        myChar = myShort;

        System.out.println("myByte = "+ myByte);

    }
}
