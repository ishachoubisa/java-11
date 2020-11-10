public class AnonymousTest {

    interface Helloable{
        public void hello();
    }
    public static void main(String[] args) {
        AnonymousTest a = new AnonymousTest();

        class LocalClass extends Object{
            public void hello(){
                System.out.println("Hello Local Class");
            }
        }
        new LocalClass().hello();

        Object anomClass = new Object(){
            public String toString(){
                return "Hello Anonymous Class";
            }
        };
        System.out.println(anomClass.toString());

        Helloable anomInterfaceClass = new Helloable() {
            public void hello() {
                System.out.println("Hello Anonymous Class" + " implementing Interface");
            }
        };
        anomInterfaceClass.hello();

        a.printHello(
                new Helloable() {
                    public void hello() {
                        System.out.println("Hello Anonymous Class" + " passed as a parameter");
                    }
                }
        );

        a.printHello(
                () -> System.out.println("Hello Lambda Expression" + " as a parameter")
        );
    }

    public void printHello(Helloable h){
      h.hello();
    }
}
