
abstract class ConceptualClass{
    private ConceptualClass(){

    }
    protected ConceptualClass(String s1){
        printSomething(s1);
    }
    public abstract void printSomething(String s1);
        }

class RealClass extends ConceptualClass {
    public RealClass(String s1){
      super(s1);
    }

    public void printSomething(String s1){
        System.out.println(s1);
    }
}

public class AbstractClassExample2 {
    public static void main(String[] args) {
        RealClass c = new RealClass("Hello World");
        c.printSomething("Hello World");
    }
}
