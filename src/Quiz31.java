public class Quiz31 {
    String getMyName(){
        return myName;
    }
    static String myName = "Test";

    public static void main(String[] args) {
        try{
            Quiz31 t1 = new Quiz31();
            Quiz31 t2 = null;
            System.out.println(Quiz31.myName);
            System.out.println(t1.myName);
            System.out.println(t1.getMyName());
            System.out.println(t2.myName);
            System.out.println(t2.getMyName());
        }catch(Exception e){
            System.out.println();
        }
    }
}
