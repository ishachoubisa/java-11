public class VarLoops {
    public static void main(String[] args) {
        for(var i = 0;i<10;i++)
        {
            System.out.println("i was inferred to be an int,value = "+i);
        }
        for(var arg : args)
        {
            System.out.println("arg inferred to be a string: "+arg);
        }
    }
}
