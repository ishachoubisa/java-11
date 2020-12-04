/**
 *              LVTI(var)
 *     You cannot use Local Variable Type Inference(var) for:
 *     class or instance variables
 *     method return types
 *     method parameters
 *     constructor parameters
 *
 *     You can use Local Variable Type Inference(var) for:
 *     Local variables in methods & code blocks
 *     Loop variables
 */




public class VarDonts {

//    //Invalid - Static class variables cannot be declared with var
//    static var classVariable = 10;
//
//    //Invalid - class instance variables cannot be declared with var
//    var instanceVariable = 20;
    public static void main(String[] args) {

    }

//    //Invalid, cannot have a method return type of var
//    public static var returnThis(String args[]){
//        return args;
//    }
//
//    //Invalid,cannot have a method parameter of var
//    public static String[] returnThat(var args){
//        return args;
//    }
}
