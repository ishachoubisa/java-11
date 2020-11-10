import java.util.ArrayList;
import java.util.List;

public class ArrayListExtras {
    public static class BaseClass{
        private String name;

        BaseClass(String name){
            this.name = name;
        }
        public String toString(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
    }

    public static void main(String[] args) {
        ArrayList<BaseClass> typedList = new ArrayList<>();
        ArrayList rawList = new ArrayList();
        typedList.add(new BaseClass("abc"));
        typedList.add(0,new BaseClass("bcd"));
        typedList.add(0,new BaseClass("cde"));

        for(BaseClass b : typedList){
            rawList.add(0,new BaseClass(b.toString()));
        }
        System.out.println("typedList = "+ typedList);
        System.out.println("rawList = "+ rawList);

        typedList.get(2).setName("ccc");
        ((BaseClass)(rawList.get(0))).setName("aaa");
        typedList.add(typedList.size(),new BaseClass("def"));

        System.out.println("typedList = "+ typedList);
        System.out.println("rawList = "+ rawList);

        typedList.add(typedList.size(),new BaseClass("def"));
//        typedList.set(typedList.size(),new BaseClass("def"));
//        typedList.add(typedList.size() + 1, new BaseClass("def"));
        System.out.println("typedList = "+ typedList);
        System.out.println("rawList = "+ rawList);

        List<BaseClass> typedSubList = List.of(new BaseClass("efg"),new BaseClass("fgh"),new BaseClass("hij"));
        typedList.addAll(typedList.size(), typedSubList);
 //       typedList.set(0,typedSubList);
        rawList.set(0,typedSubList);

        System.out.println("typedList = "+ typedList);
        System.out.println("rawList = "+ rawList);

        ArrayList<BaseClass> newBaseList = new ArrayList<>();
        newBaseList.add(0,new BaseClass("one"));

        ArrayList<BaseClass> newBaseListWithCapacity = new ArrayList<>(10);
        newBaseListWithCapacity.add(0,new BaseClass("one"));

        ArrayList<BaseClass> newBaseListWithSomeElements = new ArrayList<>(List.of(new BaseClass("one"),new BaseClass("two")));
        newBaseListWithSomeElements.add(2,new BaseClass("three"));

        List<BaseClass> typedSublist = typedList.subList(0,2);
        typedSubList.get(0).setName("ABC");

        List rawSublist = typedList.subList(0,2);
        //rawSublist.get(0).setName("ABC");
    }
}
