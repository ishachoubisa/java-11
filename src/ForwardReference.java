import org.w3c.dom.ls.LSOutput;

class Thing{
    Thing(){
        System.out.println(secondString);
        secondString = "b"+secondString;
        System.out.println("inside constructor"+secondString);

    }
    {
        System.out.println("empty block");
    }

    {
        firstString = this.secondString;
        System.out.println("Isha1");
    }
    static {
        //System.out.println(thirdString);
        thirdString = "c";
        System.out.println("inside static");
    }

    static {
        System.out.println("inside static empty block");
    }
    String firstString;
    String secondString;

    static String thirdString;

    public String toString(){
        return firstString+secondString+thirdString;
    }
}

public class ForwardReference {
    public static void main(String[] args) {
        Thing one = new Thing();
        System.out.println(one);
    }
}
