package pkga;

import pkgb.Parent2;

public class Child2 extends Parent2{
    static String name = "DEF";

    protected static String getName(){
        return name;
    }

    public static void main(String[] args) {
        System.out.println(new Child2().getName());
    }
}
