public class TruncateNumber {
    public static void main(String[] args) {
        float myFloat = 123.456f;
        Float myFloatWrapper = new Float(myFloat);
        int myNumber = (int) myFloat;
        System.out.println("myNumber = "+myNumber);
        System.out.println("Float.intValue() = "+myFloatWrapper.intValue());
    }
}
