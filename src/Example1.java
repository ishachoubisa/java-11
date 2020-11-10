public class Example1 {
    static String s;
    public static void main(String[] args) {
        String s;
        System.out.println(Example1.s);
        boolean isOK = true;
        if(isOK)
            s= Example1.s+"";
        else s="";
        System.out.println(s);
        s.concat("Hello");
        System.out.println(s);
        s.concat("World");
        System.out.println(s);
        s.toUpperCase();
        System.out.println("s = "+s);

    }
}
