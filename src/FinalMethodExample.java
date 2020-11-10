
abstract class WillHaveManySubtypes{
    public abstract void doXYourWay();
    public abstract void doYYourWay();

    public abstract String toString();

    final void doZOnlyOneWay(){
        System.out.println("Z can only be done this way");
    }
}

public class FinalMethodExample extends WillHaveManySubtypes {
    private boolean flag = false;
    public static void main(String[] args) {
        FinalMethodExample e = new FinalMethodExample();
        e.doXYourWay();
        e.doYYourWay();
        e.doZOnlyOneWay();
        System.out.println(e);
    }
    public void doXYourWay(){
        System.out.println("Implement X my way");
    }
    public void doYYourWay(){
        System.out.println("Implement Y my way");
    }
//    public void doZOnlyOneWay(){
//        System.out.println("Implement Z my way");
//    }
    public String toString(){
        //return super.toString();
        return "Not implemented yet";
    }
}
