public class TextTransform {
    public static void main(String[] args) {
        String repeatString = "Repeat After Me ";
        repeatString = repeatString.repeat(3);
        System.out.println("repeatString = "+repeatString);
        repeatString = repeatString.repeat(0);
        System.out.println("repeatString = "+repeatString);

        String charToString = String.valueOf(new char[]{'a','b','c','d','e'});
        String charToStringPartial = String.valueOf(new char[]{'a','b','c','d','e'},1,3);
        String subString = charToString.substring(1,3);
        System.out.println("charToString = "+charToString);
        System.out.println("charToStringPartial = "+charToStringPartial+", subString = "+subString);
    }
}
