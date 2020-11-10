public class BinaryCalculator2 {

    interface BinaryIntegerOperation{
        int calculate(int a, int b);
    }

    public int calculate(int a,int b,BinaryIntegerOperation op){
        return op.calculate(a,b);
    }

    public static void main(String[] args) {
        BinaryCalculator2 myApp = new BinaryCalculator2();

        BinaryIntegerOperation addition = (int a,int b) -> a+b;
        BinaryIntegerOperation subtraction = (a,b) -> a-b;
//        BinaryIntegerOperation multiplication = (int a,b) -> a*b;
//        BinaryIntegerOperation division = a, b -> a/b;
        BinaryIntegerOperation multiplication = (var a,var b) -> a*b;
        BinaryIntegerOperation division = (a,b) -> a/b;

        int value_a = 4;
        int value_b = 2;

        System.out.println("The numbers (" + value_a +", "+ value_b + ") added = " +myApp.calculate(value_a,value_b,addition));
        System.out.println("The numbers (" + value_a +", "+ value_b + ") subtracted = " +myApp.calculate(value_a,value_b,subtraction));
        System.out.println("The numbers (" + value_a +", "+ value_b + ") multiplied = " +myApp.calculate(value_a,value_b,multiplication));
        System.out.println("The numbers (" + value_a +", "+ value_b + ") divided = " +myApp.calculate(value_a,value_b,division));
    }
}
