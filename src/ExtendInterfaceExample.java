
interface Extendable{
     default void defaultMethod(){
         System.out.println("Extendable: Default method called.");
     }
     void extend();
}

interface SubExtendable extends Extendable {
     void append();
}

public class ExtendInterfaceExample implements SubExtendable {
    public static void main(String[] args) {
        ExtendInterfaceExample su = new ExtendInterfaceExample();
        su.extend();
    }
    public void extend(){
        defaultMethod();
        append();
    }
    public void append(){
        System.out.println("Appending functionality");
    }
}
