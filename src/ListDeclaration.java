
import java.util.List;
import java.util.ArrayList;

public class ListDeclaration {
    public static void main(String[] args) {
        List l;
        List<Integer> intList;
        List<ArrayList> arrayList;

        ArrayList a;
        ArrayList<String> stringArray;
        ArrayList<Integer> integerArray;

        a = new ArrayList();
        stringArray = new ArrayList<String>(10);
        integerArray = new ArrayList<Integer>(List.of(10,20,30));

        ArrayList<String> abc = new ArrayList<>();
        ArrayList<String> def = new ArrayList();

        l = a;
        intList = integerArray;

        for(int i = 0; i<5; i++){
            stringArray.add("String_" + (i+1));
            integerArray.add(i+1);
        }
        System.out.println(stringArray);
        System.out.println(integerArray);

        for(int i = 0; i<5; i++){
            stringArray.add(1,"String_" + (i+1));
            integerArray.add(1,i+1);
        }
        System.out.println(stringArray);
        System.out.println(integerArray);

        integerArray.addAll(List.of(15,25,30));
        System.out.println(integerArray);

        integerArray.addAll(1,List.of(150,250,300));
        System.out.println(integerArray);

        stringArray.remove("String_5");
        System.out.println("stringArray after removing one element, String_5 "+ stringArray.toString());

        stringArray.removeIf(s -> s.contains("_2"));
        System.out.println("stringArray after removing any elements that contain '2' "+ stringArray.toString());

        stringArray.replaceAll((s)->s.replace("String_","Test_"));
        System.out.println("stringArray after replaceAll "+ stringArray.toString());

        stringArray.replaceAll((s)->s.replace("Test_","String_"));

        stringArray.removeAll(List.of("String_1","String_3","String10"));
        System.out.println("stringArray after removing several elements "+ stringArray.toString());

        stringArray.retainAll(List.of("String_4"));
        System.out.println("stringArray after retaining only String4 "+ stringArray.toString());
        stringArray.forEach((s)-> System.out.println(s));
    }
}
