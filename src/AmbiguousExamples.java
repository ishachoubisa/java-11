
interface Confusable{
    String name = "Confusable";
    String confuse();
}

abstract class Confused{
    public static String name = "Confused";
    abstract Object confuse();
}

public class AmbiguousExamples extends Confused implements Confusable {
    public static void main(String[] args) {
        AmbiguousExamples a = new AmbiguousExamples();
        System.out.println("The method confuse returns: " + a.confuse());
    }
    public String confuse(){
        return Confused.name;
    }
}
