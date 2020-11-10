public class MainTests {
    public static void main(String... args) throws Exception{
        main("");
        main();
    }

    public static void main(String arg) {
        System.out.println("main(String arg): Not an executable main method");
    }

    public static void main() {
        System.out.println("main(): Not an executable main method");
    }
}
