public class Quiz53 {
    public static void main(String[] args) {
        int i = 0;
        try {
            i = 0;
            System.out.println("i = " + 10 / i++);
        } catch (RuntimeException e) {

        } finally {
            System.out.println("i = " + i);
        }

    }
}
