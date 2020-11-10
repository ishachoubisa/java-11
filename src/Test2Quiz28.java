
class MethodTest{
    public void methodA(boolean flag){
        if(!flag)
            return;
        System.out.println("four");
    }
    public String methodB(boolean flag,String values){
        if(!flag)
            return null;
        String a = "";
        String[] vals = values.split(",");
        for(var val : vals){
            a += val;
            //System.out.println(a);
        }
        return a;
    }
}

public class Test2Quiz28 {
    public static void main(String[] args) {
        MethodTest t = new MethodTest();
        System.out.println(t.methodB(true,"one,two,three"));
        t.methodA(true);
    }
}
