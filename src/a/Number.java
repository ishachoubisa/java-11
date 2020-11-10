package a;

public class Number {
    Number number;
    java.lang.Number numberj;

    Number(java.lang.Number number) {
        this.numberj = number;
        System.out.println("Constructor of java.lang.Number");
    }
    Number(Number number){
         this.number = number;
        System.out.println("Constructor of a.Number");
        }

    public static void main(String[] args)
    {
        Number n = new Number(10);
        Number n2 = new Number(n);
    }

}
