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
}