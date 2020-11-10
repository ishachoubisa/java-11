import java.io.IOException;

class CustomThrowable extends Throwable{
    CustomThrowable(String message){
        super(message);
    }
}

class CustomException extends Exception{
    CustomException(String message){
        super(message);
    }
}

class SuperClass3{
    public void methodSuperClass() throws CustomException {

    }
}

class SubClass3 extends SuperClass3 {
    public void methodSubClass(){
        try{
            methodSuperClass();
        }catch (Exception CustomException){

        }
    }
}

public class CatchExamples {
    public static void main(String[] args) {
        CatchExamples ce = new CatchExamples();

        try{
            SubClass3 c = new SubClass3();
            c.methodSuperClass();
            ce.testError();
        }catch (ArithmeticException e){
            e = new ArithmeticException("This works");
            throw e;
        }
        catch(CustomException | RuntimeException | IOException e){
            throw new RuntimeException("So many exception, so little time");
        }
    }
    private void testError() throws IOException{

    }
}
