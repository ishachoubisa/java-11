public class ForLoopExample1 {
    public static void main(String[] args) {
        System.out.println("--------TRADITIONAL FOR LOOP---------");
        for(int i=0; i<args.length; i++)
        {
            System.out.println("Argument"+(i+1)+"="+args[i]);
        }
        System.out.println("---------ENHANCED FOR LOOP----------");
        int i=0;
        for(String arg : args)
        {
            System.out.println("Argument"+(++i)+"="+arg);
        }
    }
}
