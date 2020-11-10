
import java.util.List;
import java.util.ArrayList;

public class GenericCasts {
    static class BaseClass{
        String name = "Base Case";
        public String toString(){
            return getClass().getName();
        }
    }
    static class NextClass extends BaseClass{
        String name = "Next Base Case";
        public String toString(){
            return getClass().getName() + ":" + name;
        }
        public static void testIt(List<BaseClass> baseListParameter){
            System.out.println(baseListParameter);
        }
    }

    public static void main(String[] args) {
        ArrayList rawList = new ArrayList();

        List aList;

        aList = rawList;

        ArrayList<BaseClass> baseList = new ArrayList<>();
        List<BaseClass> bList;
        bList = baseList;

        rawList.add(new NextClass());
        baseList.add(new NextClass());

        System.out.println("We can use either variable to print the raw ArrayList");
        System.out.println("-- aList = "+ aList);
        System.out.println("-- rawList = "+ rawList);
        System.out.println("We can use either variable to print the typed ArrayList");
        System.out.println("-- bList = "+ bList);
        System.out.println("-- baseList ="+ baseList);

//        rawList.add(new StringBuilder("Hello"));
//        baseList.add(new StringBuilder("Hello"));

        NextClass nextClass = new NextClass();
        BaseClass baseClass = nextClass;
        ArrayList<NextClass> nextList = new ArrayList<>();
        nextList.add(nextClass);
        rawList = nextList;
        aList = nextList;

//        baseList = nextList;
//        bList = nextList;

        NextClass.testIt(bList);
        NextClass.testIt(baseList);
       // testIt(nextList);

//        baseList = (ArrayList<BaseClass>) nextList;
//        ArrayList<NextClass> anotherTest = (ArrayList<NextClass>) rawList;
//        ArrayList<NextClass> anotherTest = (ArrayList<NextClass>) baseList;

        NextClass next = nextList.get(0);
        System.out.println("next here is " + next);

        BaseClass base = baseList.get(0);
        System.out.println("base here is " + base);

        next = (NextClass) baseList.get(0);
        System.out.println("next here is " + next);

        next = (NextClass) rawList.get(0);
        System.out.println("next here is " + next);
    }
}
