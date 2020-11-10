public class Quiz12 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder(5);
        builder.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(builder);
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        char[] myCharArray;
        if("hello"=="hello")
            myCharArray = new char[5];
        builder.getChars(0,5,new char[5],0);
        System.out.println(new String(myCharArray).trim()+"*");
    }
}
