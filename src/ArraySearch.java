
import java.util.List;
import java.util.Arrays;

public class ArraySearch {
    public static void main(String[] args) {
        String[] firstString = {"abc","def","ghi","jkl","mno","pqr","stu","vwx","yz"};
        String[] firstStringUnsortedDuplicates = {"jkl","mno","pqr","stu","vwx","yz","jkl","abc","def","ghi"};
        String[] partialFirstString = {"abc","def","ghi","jkl","mno"};

        List firstList = List.of(firstString);
        List secondList = Arrays.asList(firstStringUnsortedDuplicates);

        System.out.println("------Arrays binarySearch-------");

        String searchString = "jkl";
        System.out.println("Arrays.binarySearch(firstString,\"jkl\") = "+Arrays.binarySearch(firstString,"jkl"));
        System.out.println("Arrays.binarySearch(firstString,\"aaa\") = "+Arrays.binarySearch(firstString,"aaa"));
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicates,\"jkl\" = "+Arrays.binarySearch(firstStringUnsortedDuplicates,"jkl"));
        System.out.println("Arrays.binarySearch(firstStringUnsortedDuplicates,\"abc\" = "+Arrays.binarySearch(firstStringUnsortedDuplicates,"abc"));

        System.out.println("--------Arrays mismatch-------");
        System.out.println("Arrays.mismatch(firstString,partialFirstString) = "+Arrays.mismatch(firstString,partialFirstString));
        System.out.println("Arrays.mismatch(firstStringUnsortedDuplicates," + " new String[]{\"jkl\",\"mno\"}) = "+Arrays.mismatch(firstStringUnsortedDuplicates, new String[]{"jkl","mno"}));


        String[] anotherUnsortedSet = {"jkl","def","abc","ghi","mno"};
        System.out.println("firstList.containsAll(Arrays.asList(anotherUnsortedSet)) = "+firstList.containsAll(Arrays.asList(anotherUnsortedSet)));
        System.out.println("secondList.indexOf(\"jkl\") = "+secondList.indexOf("jkl"));
        System.out.println("secondList.lastIndexOf(\"jkl\") = "+secondList.lastIndexOf("jkl"));


        System.out.println("---------List methods----------");
        System.out.println("firstList.contains(\"def\") = "+firstList.contains("def"));
        System.out.println("firstList.containsAll(Arrays.asList(partialFirstString)) = "+firstList.containsAll(Arrays.asList(partialFirstString)));


    }
}
