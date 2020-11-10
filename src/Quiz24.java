
 class GreatStuff{
    public final static String APP_NAME = "GreatApp";
    public static int counter = 1;
    public static int helpfulMethod(){
        return counter++;

    }
}

 public class Quiz24 {
     public static void main(String[] args) {
         System.out.println(GreatStuff.APP_NAME+" "+ GreatStuff.helpfulMethod()+" "+ GreatStuff.counter);
     }
 }
