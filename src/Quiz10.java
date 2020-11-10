import java.util.Arrays;

public class Quiz10 {
    public static void main(String... args) {
        String hello = "hello";

        for(var arg: args)
        {
            String sb = new String(arg);
            System.out.println(sb);
            System.out.print(arg.equals(sb)+" ");
            System.out.print( (hello.equals(arg))+" ");
            System.out.println( (hello==arg.intern()));
        }
    }
}
