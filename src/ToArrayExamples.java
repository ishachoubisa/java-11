import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToArrayExamples {
    public static void main(String[] args) {
        int testValue = 0;
        ArrayList<Integer> intList = new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList rawList = new ArrayList(List.of(1,2,3,4,5));

        Integer[] aIntArray = new Integer[10];
        System.out.println("------- All tests execute with lists that "+ "contain: "+ rawList + "-----");
        System.out.println("\n Scenario 1: Parameter is reference variable" + "for Integer[10], elements all null ");

        var bInt = intList.toArray(aIntArray);
        System.out.println("Result type from ArrayList<Integer> "+ "assigned to var = "+ bInt.getClass().getName());
        System.out.println("---- Resulting array elements = "+ Arrays.toString(bInt));

        testValue = bInt[0];
        System.out.println("--- No cast required at individual level: "+ "first element is " + testValue);

        aIntArray = new Integer[10];
        var bRaw = rawList.toArray(aIntArray);
        System.out.println("Result type from ArrayList assigned to var = " + bRaw.getClass().getName());
        System.out.println("----Resulting array elements = "+ Arrays.toString(bRaw));

        testValue = (int) bRaw[0];
        System.out.println("---- Cast required at individual level: the "+ "first element is " + testValue);

        System.out.println("\n Scenario 2: Parameter is reference variable " + " for Integer[10], elements all populated ");
        aIntArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] cInt = intList.toArray(aIntArray);
        System.out.println("Result type from ArrayList<Integer> "+ "assigned to Integer[] = " + cInt.getClass().getName());
        System.out.println("-----Resulting array elements = " + Arrays.toString(cInt));

        testValue = cInt[0];
        System.out.println("---- No cast required at individual level:" + " the first element is "+ testValue);
        aIntArray = new Integer[]{1,2,3,4,5,6,7,8,9,10};
        Integer[] cRaw = (Integer[]) rawList.toArray(aIntArray);
        System.out.println("Result type from ArrayList assigned to Integer[] "+ " required casting = "+ cRaw.getClass().getName());
        System.out.println("----Resulting array elements = "+ Arrays.toString(cRaw));

        testValue = cRaw[0];
        System.out.println("No casting is required at individual level since "+ " we cast entire array to (Integer[]) : the first element is "+ testValue);

        System.out.println("\n Scenario 3: No parameter passed");
        Object[] dInt = intList.toArray();
        System.out.println("Result type from ArrayList<Integer> "+ " assigned to Object[] "+ dInt.getClass().getName());
        System.out.println("---Resulting array elements = "+ Arrays.toString(dInt));

        testValue = (int) dInt[0];
        System.out.println("Cast is required at individual level: "+ " the first element is "+ testValue);

        Object[] dRaw = rawList.toArray();
        System.out.println("Result type from ArrayList "+ " assigned to Object[] = " + dInt.getClass().getName());
        System.out.println("----Resulting array elements "+ Arrays.toString(dInt));

        testValue = (int) dRaw[0];
        System.out.println("Cast is required at individual level: "+" the first element is "+ testValue);

        System.out.println("\nScenario 4: Array passed is too small");

        aIntArray = new Integer[3];

        var eInt = intList.toArray(aIntArray);
        System.out.println("Result type from ArrayList<Integer> "+ " assigned to var = " + eInt.getClass().getName());
        System.out.println("----Resulting array elements "+ Arrays.toString(eInt));

        testValue = eInt[0];
        System.out.println("----No cast required at individual level: "+ " the first element is "+ testValue);

        aIntArray = new Integer[3];
        var eRaw = rawList.toArray(aIntArray);
        System.out.println("Result type from ArrayList assigned to var = "+ eRaw.getClass().getName());
        System.out.println("----Resulting array elements = "+ Arrays.toString(eRaw));

        testValue = (int) eRaw[0];
        System.out.println("----Cast required at individual level: "+ " fist element is "+ testValue);

        System.out.println("\nScenario 5 Array passed is now a Number[] and not a reference variable");

        var fInt = intList.toArray(new Number[0]);
        System.out.println("Result type from ArrayList<Integer> "+" assigned to var = " + fInt.getClass().getName());
        System.out.println("----Resulting array elements "+ Arrays.toString(fInt));

        testValue = (int)fInt[0];
        System.out.println("----Cast required at individual level: "+ " the first element is "+ testValue);

        var fRaw = rawList.toArray(new Number[0]);
        System.out.println("Result type from ArrayList assigned to var = "+ fRaw.getClass().getName());
        System.out.println("----Resulting array elements = "+ Arrays.toString(fRaw));

        testValue = (int) fRaw[0];
        System.out.println("----Cast required at individual level: "+ " fist element is "+ testValue);
    }
}
