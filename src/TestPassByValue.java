public class TestPassByValue {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        String aString = new String("123");
        String bString = new String("456");

        StringBuilder abc = new StringBuilder("abc");
        StringBuilder def = new StringBuilder("def");

        System.out.println("---------Before Method call-----------");
        System.out.println("abc.hashCode() = "+ abc.hashCode() + ",value = "+ abc);
        System.out.println("def.hashCode() = "+ def.hashCode() + ",vaLUE = "+ def);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("aString.hashCode() = "+aString.hashCode() + ",value = "+ aString);
        System.out.println("bString.hashCode() = "+bString.hashCode() + ",value = "+ bString);

        changeValue(a,b);
        changeValue(aString,bString);
        changeValue(abc,def);

        System.out.println("-----------After method call------------");
        System.out.println("abc.hashCode() = "+ abc.hashCode() + ",value = "+ abc);
        System.out.println("def.hashCode() = "+ def.hashCode() + ",vaLUE = "+ def);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("aString.hashCode() = "+aString.hashCode() + ",value = "+ aString);
        System.out.println("bString.hashCode() = "+bString.hashCode() + ",value = "+ bString);
    }
    public static void changeValue(Object o1,Object o2){
        switch (o1.getClass().getName()){
            case("java.lang.Integer"):
                o1 = 10;
                o2 = 20;
                System.out.println("value in case int   " +o1 +"......" +o2);
                break;
            case("java.lang.String"):
                String temp;
                temp = o1.toString();
                o1 = o2;
                o2 = temp;
                System.out.println("value in case string    " +o1 +"......." +o2);
                break;
            case("java.lang.StringBuilder"):
                o1 = o1.toString().concat("XXX");
                o2 = o2.toString().concat("ZZZ");
                System.out.println("value in case of StringBuilder    " +o1 +"........" +o2);
                break;
        }
    }
}
