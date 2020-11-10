public class Quiz22 {
    public static void main(String[] args) {
        Quiz22 t = new Quiz22();
        t.printItems();
    }
    public void printItems(){
        for(int i=0; i<=5; i++){
            String temp = "Item"+i;
            doSomething(temp);
        }
        System.out.println("Completed");
    }
    public void doSomething(String s){
        System.out.println(s);
    }
}
