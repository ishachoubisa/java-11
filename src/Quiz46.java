public interface Quiz46 {
    //public static int counter;
    void doItPrivately(){
        System.out.println("A private method");
    }
    void doThat();
    default String doThat(String s){
        return s;
    }
}
