
interface Abstractable{
    void makeConcrete();
}

abstract class AbstractClass implements Abstractable {
    abstract void callConcrete();
}

public class AbstractableExample extends AbstractClass {
    public static void main(String[] args) {
        AbstractableExample e = new AbstractableExample();
        e.callConcrete();
    }
    public void makeConcrete(){
        System.out.println("method declare on Abstractable interface");
    }
    public void callConcrete(){
        System.out.println("method declare on AbstractClass class");
        makeConcrete();
    }
}
