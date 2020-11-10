import java.util.function.IntUnaryOperator;

public class Calculator2 {

//    interface UnaryIntegerOperation{
//        int calculate(int a);
//    }

    public int calculate(int a, IntUnaryOperator op){
        return op.applyAsInt(a);
    }

    public static void main(String[] args) {
        Calculator2 myApp = new Calculator2();

        IntUnaryOperator square = (int a) -> a*a;
        IntUnaryOperator cube = (a) -> a*a*a;
        IntUnaryOperator increment = a -> a+1;
        IntUnaryOperator decrement = a -> {
            return a-1;
        };

        int value = 2;
        System.out.println("The number (" + value + ") squared = " +myApp.calculate(value,square));
        System.out.println("The number (" + value + ") cubed = " +myApp.calculate(value,cube));
        System.out.println("The number (" + value + ") incremented = " +myApp.calculate(value,increment));
        System.out.println("The number (" + value + ") decremented = " +myApp.calculate(value,decrement));


    }
}
