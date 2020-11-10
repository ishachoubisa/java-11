
class GlobalInformation{
    public static int DogCount;
    public static int CatCount;
    public static int TreeCount;
}

abstract class CounterClass{
    public abstract void countMyInstances();
}

abstract class Animal3 extends CounterClass {
    public Animal3(String name,String type){
        this.name = name;
        this.type = type;
        countMyInstances();
    }
    private String name;
    private String type;
}

class Dog3 extends Animal3 {
    public Dog3(String name,String type){
        super(name,type);
    }
    public void countMyInstances(){
        GlobalInformation.DogCount++;
    }
}

class Cat3 extends Animal3 {
    public Cat3(String name,String type){
        super(name,type);
    }
    public void countMyInstances(){
        GlobalInformation.CatCount++;
    }
}

class Tree3 extends CounterClass {
    public Tree3(){
        countMyInstances();
    }
    public void countMyInstances(){
        GlobalInformation.TreeCount++;
    }
}

public class CompareExamples {
    public static void main(String[] args) {
        Dog3 d;
        Cat3 c;
        Tree3 t;
        for(int i=0; i<5; i++){
            d = new Dog3("Dog_" + (i+1),"dog");
        }
        for(int i=0; i<7; i++){
            c = new Cat3("Cat_" + (i+1),"cat");
        }
        for(int i=0; i<3; i++){
            t = new Tree3();
        }
        System.out.println("Number of Cat instances = " + GlobalInformation.CatCount);
        System.out.println("Number of Dog instances = " + GlobalInformation.DogCount);
        System.out.println("Number of Tree instances = " + GlobalInformation.TreeCount);
    }
}
