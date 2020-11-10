public class ThrowsClauseExample {
    class ACustomRuntimeException extends RuntimeException{
        ACustomRuntimeException(String message){
            super(message);
        }
    }

    class ACustomCheckedException extends Exception{
        ACustomCheckedException(String message){
            super(message);
        }
    }

    class ACustomThrowable extends Throwable{
        ACustomThrowable(String message){
            super(message);
        }
    }

    class AnError extends Error{
        AnError(String message){
            super(message);
        }
    }

    public static void main(String[] args) {
        ThrowsClauseExample t = new ThrowsClauseExample();

        for(int i=0; i<4; i++){
            try{
                switch(i){
                    case 0:
                        t.methodOne();
                        break;
                    case 1:
                        t.methodTwo();
                        break;
                    case 2:
                        t.methodThree();
                        break;
                    case 3:
                        t.methodFour();
                        break;
                }
            }
            catch (ACustomThrowable te){
                System.out.println("In the catch clause for" + " ACustomThrowable in main(): "+ te);
            }
            catch(AnError ae){
                System.out.println("In the catch clause for" + " AnError in main(): "+ ae);
            }
            catch (ACustomRuntimeException are){
                System.out.println("In the catch clause for "+ "ACustomRuntimeException in main(): "+ are);
            }catch (RuntimeException e){
                System.out.println("In the catch clause of main(): "+ e);
            }
        }
    }

    private void methodOne(){
        throw new ACustomRuntimeException("Error in methodOne");
    }

    private void methodTwo(){
        try{
            throw new ACustomCheckedException("Error in methodTwo");
        }catch (Exception e){
            System.out.println("In the catch clause of methodTwo(): "+ e);
            throw new ACustomRuntimeException("Changed methodTwo to throw ACustomRuntimeException");
        }
    }

    private void methodThree() throws ACustomThrowable, ACustomRuntimeException{
        if(10%3==0)
           throw new ACustomThrowable("Error in methodThree");
        else
            throw new ACustomRuntimeException("Error in methodThree");
    }

    private void methodFour(){
        throw new AnError("Error in methodFour");
    }
}

