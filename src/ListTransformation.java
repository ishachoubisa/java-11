
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTransformation {
    public static void main(String[] args) {

        Integer[] integerArray = new Integer[10];

        Arrays.setAll(integerArray,(index)->index+1);
        System.out.println("integerArray values = "+Arrays.toString(integerArray));

        List anotherList = List.of(integerArray);
        System.out.println("anotherList values = "+anotherList.toString());

        List shortList = anotherList.subList(3,7);
        System.out.println("shortList values = "+shortList.toString());

        Integer[] repeatedArray = new Integer[10];
        anotherList.toArray(repeatedArray);
        System.out.println("array created from toArray method = "+Arrays.toString(repeatedArray));
        System.out.println("array created from toArray method = "+anotherList.toString());

        System.out.println("loop through anotherList.iterator() values...");
        for(Iterator it = anotherList.iterator();it.hasNext();)
        {
            System.out.println(it.next());
        }

        System.out.println("loop through anotherList.listIterator() values...");
        ListIterator lit = anotherList.listIterator();

        for(int i=0;lit.hasNext();i++){
            System.out.println(lit.next());
            if(i==4){
                System.out.println("\nreverse direction");
                for(;lit.hasPrevious();){
                    System.out.println(lit.previous());
                }
                break;
            }
        }
    }
}
