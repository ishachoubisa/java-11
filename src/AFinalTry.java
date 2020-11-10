import java.io.IOException;

public class AFinalTry {
    public static void main(String[] args) {

    }
    public static void someMethodThrowsException() throws IOException{
        try{
            System.out.println("Doing something");
        }catch(Exception e){
            throw new IOException("Testing Catch");
        }
    }
}
