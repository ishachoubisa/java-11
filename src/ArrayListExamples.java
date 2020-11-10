import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExamples {
    public static void main(String[] args) {
        ArrayList<String> firstArray = new ArrayList(List.of("ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU", "VWX", "YZ"));
        ArrayList<String> secondArray = new ArrayList(List.of("ABC", "DEF", "GHI", "JKL", "MNO", "PQR", "STU", "VWX", "YZ"));
        ArrayList<String> thirdArray = new ArrayList<>();

        System.out.println("thirdArray.isEmpty() = " + thirdArray.isEmpty());
        System.out.println("firstArray.equals(secondArray)) =" + (firstArray.equals(secondArray)));
        System.out.println("firstArray.equals(thirdArray)) =" + (firstArray.equals(thirdArray)));
        System.out.println("firstArray.contains(\"DEF\")) =" + (firstArray.contains("DEF")));
        System.out.println("firstArray.contains(\"ZZZ\")) =" + (firstArray.contains("ZZZ")));
        System.out.println("firstArray.containsAll(\"ABC,DEF\")) =" + (firstArray.containsAll(List.of("ABC","DEF"))));
        System.out.println("firstArray.containsAll(\"DEF,ABC\") =" + (firstArray.containsAll(List.of("DEF","ABC"))));
        System.out.println("firstArray.containsAll(\"ZZZ,ABC\")) =" + (firstArray.containsAll(List.of("ZZZ","ABC"))));
        System.out.println("firstArray.indexOf(\"DEF\") =" + (firstArray.indexOf("DEF")));
        System.out.println("firstArray.indexOf(\"ZZZ\") =" + (firstArray.indexOf("ZZZ")));
        System.out.println("firstArray.lastIndexOf(\"DEF\") =" + (firstArray.lastIndexOf("DEF")));
        System.out.println("firstArray.lastIndexOf(\"ZZZ\") =" + (firstArray.lastIndexOf("ZZZ")));
        System.out.println("firstArray.subList(2,4)) = " + (firstArray.subList(2,4)));

        Iterator forwardIt = firstArray.iterator();
        while (forwardIt.hasNext()){
            System.out.println(forwardIt.next()+ " ");
        }

        ListIterator traverseIt = firstArray.listIterator(2);
        if(traverseIt.hasNext())
            System.out.println("\ntraverseIt.next() "+ traverseIt.next());

        traverseIt = firstArray.listIterator(2);
        if(traverseIt.hasPrevious()){
            System.out.println("traverseIt.previous() = " + traverseIt.previous());
        }
    }
}
