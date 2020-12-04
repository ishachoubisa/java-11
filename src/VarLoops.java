public class VarLoops {
    public static void main(String[] args) {

        //use LVTI var in regular for loop
        for(var i = 0; i<10; i++){
            System.out.println("i was inferred to be an int, value = " + i);
        }

        //use LVTI var in enhanced for loop
        for(var arg : args){
            System.out.println("arg inferred to be a String: "+ arg);
        }
    }
}
