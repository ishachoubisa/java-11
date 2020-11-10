
interface ITest{
    void myMethod();
}

abstract class ATest1 implements ITest {
    abstract public void myMethod();
}

public class Quiz48 {
    public static void main(String[] args) {
        Quiz48 t = new Quiz48();
        t.myMethod();
    }
    public void myMethod(){
        System.out.println("Success");
    }
}
