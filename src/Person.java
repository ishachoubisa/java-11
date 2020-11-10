/**
 * Person.name is a class variable (static variable) so it will
 * maintain the last value,its set to,which was deb and thats
 * because only two argument constructors set Person.name
 * Ann's information was set to default,instanceName equals
 * UNKNOWN and age equals 25 and thats becoz we use no arg
 * constructor initially
 * now setting age and instanceName in setter method change
 * the instanceName equals ann and age equals 21
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
    public String toString(){
        return instanceName + "is" + age + "years old (Person.name = " + name +")";
    }
//    public String getAgeGroupClassification(){
//        //Declaring a local variable ageClassification, initializing to "GenY"
//        String ageClassification = "GenY";
//    }
}