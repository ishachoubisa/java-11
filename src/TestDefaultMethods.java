
interface Teachable{
    default void teachTheseLessons(){
        System.out.println("Everyone should learn art and music");
    }
    void teach();
}

interface Trainable{
    default void teachTheseLessons(){
        System.out.println("Train them to do this");
    }
    void train();
}

public class TestDefaultMethods implements Teachable, Trainable {
    public void teach(){
        teachTheseLessons();
    }
    public void train(){
        System.out.println("Everyone can be trained to get up early");
    }
    public void teachTheseLessons(){
        System.out.println("Everyone should learn math and science");
    }

    public static void main(String[] args) {
        TestDefaultMethods t = new TestDefaultMethods();
        t.teach();
        t.train();
    }
}
