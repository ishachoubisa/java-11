
abstract class AbstractClassQ39{
    final void myOwnMethod(){
        System.out.println("my own");
    }
    void familyMethod(){
        System.out.println("my family");
        printFamilyTree();
    }
    abstract void printFamilyTree();
}

public abstract class Quiz39 extends AbstractClassQ39 {
    public static void main(String[] args) {
        printFamilyTrees();
    }
    protected static void printFamilyTrees(){
        //Quiz39 t = new Quiz39();
        //t.printFamilyTree();
    }
}
