import org.w3c.dom.ls.LSOutput;

/**
 *        23 "Local variable scope- Out of ordinary concept"
 * You can defined a nested or inner class within a method,which
 * seems to break the local variable rule we have talked about in
 * this section of course.The code we paste right now compiles
 * and executes without problems.The reason for that is becoz an
 * inner class has an implied qualifier reference to the
 * outer class object and its attribute and methods.We have created
 * a outer class NestedScope and a inner class locallyDefinedClass
 * within our nested scope class.Now again this code seems to break
 * the rules for scoping,but if you remember that a class defined
 * locally has an implied qualifier applied to any attribute and
 * method in outer class then you can keep the track of your variable.
 *
 * i m going to remove int type proceeding 5 in second for loop that means we
 * are not declaring new variable i but rather we are attempting to
 * set existing variable to 5 and scrolling up we can see we have
 * defined i in starting after main method. i m going to remove
 * the type int in second loop we got an error if we hover over on i
 * it says if variable i is accessed from within the inner class
 * needs to be final or effectively final.Lets undo the change
 *
 * Lets change i in different way put i++ after instantiation of
 * locallyDefinedClass we will see the same error we get when we
 * hover over on i in third loop,and just outside the third loop where
 * we have written value of i after loop we got same error variable
 * i accessed from within inner class,needs to be final or effectively
 * final.So we will undo the change.
 */


public class NestedScope {
    public static void main(String[] args) {
        //local variable i declared and initialized
        int i = 10;
        class locallyDefinedClass{
            {
                //i from method scope still visible in nested local class
                System.out.println("value of i BEFORE LOOP " + i);
                System.out.println("---------");

                //Because this for loop is within a local class,this
                //is valid
                  for(int i=0; i<5; i++){
                      System.out.println("value of i during FIRST loop " + i);
                  }
                System.out.println("-----------");

                  //the local variable i from previous loop has gone out of scope
                  //so it is ok to create another local variable in the second loop
                  //declaration of same name
                  for(int i=5; i>0; i--){
                      System.out.println("value of i during SECOND loop "+ i);
                  }
                System.out.println("--------------");

                  //assign local loop variable j to local variable i from the
                  //surrounding method of nested class
                for(int j=i; j<15; j++){
                    System.out.println("value of i,j during THIRD loop "+ i + "," + j);
                }
                System.out.println("value of i After LOOP "+ i);
            }
        }
        System.out.println("value of i before local class instantiated "+ i);
        new locallyDefinedClass();
        //i++;
        System.out.println("value of i after local class instantiated "+ i);
    }
}

