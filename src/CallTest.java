
class test{
    public int test;
    {
        test = 1;
    }
    public int test(){
        return test;
    }
    public test(){
        test = 2;
    }
    {
        test = 3;
    }
//    static{
//        test = 4;
//    }
    public String toString(){
        return ""+test();
    }
}

public class CallTest {
    public static void main(String[] args) {
        test test = new test();
        System.out.println(test);
    }
}
