package pkga;

public class SuperClass1 {
    String text = "hello";
    protected SuperClass1(){}

    protected SuperClass1(String text){}
    protected void setText(String text){
        this.text = text;
       // System.out.println(text);
    }
    public String toString(){
        return text;
    }
}
