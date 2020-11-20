/**
 * Regardless of argument passed,the local variable type from line 1
 * is only in scope during the if statement block and therefore
 * is not available outside the if statement block.The type referred
 * to on line 3 is the static variable type and is not changed during
 * the execution of code, so the result is always the same - output is
 * "this is this".
 */


public class Quiz6 {
    static String type = "this";

        public static void main(String[] args) {
            String s = (args.length > 0) ? "switch" : "";
            String caseVal = (args.length > 1) ? args[1] : "";

            if (s == "switch") {
                String type;  // Line 1
                switch (caseVal) {

                    case "this":
                        type = "that";
                        break;
                    case "that":
                        type = "this";
                        break;
                    case "other":
                    default:
                        type = "somethingelse";
                }
                if (type=="that") type="this";  //Line 2

            }
            System.out.println("this is " + type);  //Line 3
        }
    }

