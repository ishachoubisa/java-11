
//import garden.vegetables.VineVegetable;

public class TestImport {
    public static void main(String[] args)
    {
      String s = "We are testing import statement";
        System.out.println(s);
        VineVegetable.main(args);
        nursery.vegetables.VineVegetable.main(args);
    }
}

class VineVegetable{
    public static void main(String[] args)
    {
        System.out.println("I am a local VineVegetable");
    }
}