/**
 * Person.name is a class variable (static variable) so it will
 * maintain the last value,its set to,which was deb and thats
 * because only two argument constructors set Person.name
 * Ann's information was set to default,instanceName equals
 * UNKNOWN and age equals 25 and thats becoz we use no arg
 * constructor initially
 * now setting age and instanceName in setter method change
 * the instanceName equals ann and age equals 21
 *
 * lets explore a lower level local variable declaration with our
 * person class by adding a method that will print out generation
 * category of our person,based on the age range we want output or
 * set a string to be that value. Thats our getAgeGroupClassification
 * method depending on value of age we are updating ageClassification
 * local variable. Updating our toString method on Person class and
 * put this information out.
 *
 * In the first if statement on line 112,lets declare it your local
 * variable but with the same name as ageClassification which is
 * defined on line 107. Now generally this would be perfectly fine
 * ,except we have already created a local variable with this name
 * and the surrounding scope and compiler can't distinguish which
 * ageClassification is meant in this if statement and so a compiler
 * error occurs saying ageClassification is already defined in the
 * scope. So we will undo the change.
 *
 * on line 78 we have declare a local variable ageType in elseif
 * statement and the ageClassification is equal to ageType plus
 * ageClassification, if we delete this code on line 84 and if i
 * move this line outside the scope. when you hover over the ageType
 * ,there is a error cannot resolve the symbol ageType. This error
 * is becoz we can not use local variable outside its scope.
 *
 *                22 "More on scope"
 * we are going to look on scope of variable in loops. But firstly
 * we are going to look on method scope.
 * on line 94 we have created a method getDecade and we have declare
 * a local variable decadeString that only has scope in this method.
 * Nothing outside this method can reference this variable. This is
 * method scope.If we define age variable in this method
 * (int age = Integer.parseInt(this.age/10);) and hover over the age
 * variable it will show age variable is already defined in this scope.
 * So the local variable name age clash with parameter age of getDecade.
 * Note that the instance variable age (this.age) is not causing any
 * issue becoz this can be qualified using this keyword, all right.
 * now i am gono comment that line. Now i am going to replace the
 * existing getDecade method with a new definition that include a loop
 *
 * we have created a local variable decadeNumber and local variable j
 * defined outside the loop we have created decadeString as well.
 * but we declare and initialize a local variable i in the loop
 * statement increment i and j at the end of each iteration. Now
 * this is valid becoz both i and j are in scope in loop.
 *
 * what happens if we wanna set j to a different value during loop
 * initialization. So what we should be able to do is put a comma
 * after int i=0,j=1. you can see there variable j is already define
 * in scope and becoz we put j = 1 in same statement as initialization
 * block of for loop this has caused compiler error.The compiler
 * think you want to create another variable j and this isn't allowed
 * if we change the code with i=j=0 it is correct. So here we hae declare
 * a new variable called i and have initialised to  existing variable j
 * which is set to 0 when loop gets initialise. And becoz assignments
 * are right to left j is initialised to 0 first and then i is initialized
 * to j.
 *
 * Creating another loop and in this loop not declaring j is perfectly valid
 * but using i without declaring it cause error becoz scope of i is
 * ended with end of first loop.
 * */


public class Person {
    static String name = "UNKNOWN";
    String instanceName = "UNKNOWN";
    String age = "25";

    public Person() {
    }

    public Person(String age){
        age=age;
    }

    public Person(String name,String age){
        this.age = age;
        this.instanceName = Person.name = name;
    }
    public void setAge(String age){
        this.age=age;
    }
    public void setInstanceName(String instanceName){
        this.instanceName = instanceName;
    }
    public String toString() {
//        return instanceName + "is" + age + "years old (Person.name = " + name +")";
//        return instanceName + "is" + age + "years old (" + getAgeGroupClassification() +")";
        return instanceName + " is " +age+ " years old (" + getAgeGroupClassification() + ", " +
                getDecade(Integer.parseInt(this.age)) + ")";
    }

    //this method tests local variable declaration in if/else blocks
    public String getAgeGroupClassification(){

        //Declaring a local variable ageClassification, initializing to "GenY"
        String ageClassification = "GenY";

        //local variable age 'shadows' the instance variable age
        int age = Integer.parseInt(this.age);

        if(age >= 95){
            ageClassification = "The greatest generation";
        }else if(age >= 75){
            ageClassification = "The silent generation";
        }else if(age >= 55){
            ageClassification = "The baby boomer";
        }else if(age >= 40){
            ageClassification = "GenX";
        }else if(age >= 20){
            ageClassification = "Millenial";
            String ageType = "";
            if(age >= 21){
                ageType = "Voting ";
            }
            ageClassification = ageType + ageClassification;
        }
        return ageClassification;
    }

    public String getDecade(int age){
        String decadeString = "";
//        int age = Integer.parseInt(this.age)/10;

        //this variable holds the maximum decade
        int decadeNumber = age/10;

        //Add variable j
        int j = 0;
        for(int i=j=1; i<(decadeNumber+1); i++,j++){
            //local loop block variable named decade, scope of loop
            String decade = "Decade" + (age/10);
            if(i==(decadeNumber)){
                decadeString = decade;
                //int i = 1; we can not defined a new variable i,it is already defined in scope
            }
        }
        int modyear = age%10;
//        for(j = 0; j<modyear; j++){ //VALID, not re-declaring j
//            i++;        //invalid no long in scope
//        }
        decadeString += ", Year " + modyear;
        return decadeString;
    }
}