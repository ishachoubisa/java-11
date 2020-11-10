

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class ForEachExamples {
    public static String setValue(int indx){
        int intA = 65;
        int multiplier = indx/26;
        int cntr = indx - (multiplier * 26);
        return (char) (cntr + intA) + "_TEST_" + (indx + 1);
    }

    public static void main(String[] args) {
        String[] stringArray = new String[50];
        Arrays.setAll(stringArray, ForEachExamples::setValue);
        ArrayList<String> alist = new ArrayList<String>(Arrays.asList(stringArray));
        System.out.println(alist + "\n");
        alist.stream().filter(//Only want values that start with A or B
                 //(Predicate<String>)
                         (s) -> s.startsWith("A") || s.startsWith("B"))
                .forEach(System.out::println);

        alist.sort((a, b) -> {
            return Integer.valueOf(b.split("_")[2]).compareTo(
                    Integer.valueOf(a.split("_")[2]));
        });
        System.out.println("\n" + alist);

        alist.sort((a, b) -> b.compareTo(a));
        System.out.println("\n" + alist);
    }
}
