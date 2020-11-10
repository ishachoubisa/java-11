
class ATest{
//    ATest(){
//        System.out.println("I am Isha");
//    }
    ATest(String name){
        System.out.println("I am Super "+ name);
    }
}

class BTest extends ATest {
   private String name;
   BTest(String name){
     super(name);
       this.name = name;
   }
   public String getName(){
       return this.name;
   }
}

public class ConstructorExample {
    public static void main(String[] args) {
        BTest btest = new BTest("Jeff");
        System.out.println(btest.getName());
    }
}
