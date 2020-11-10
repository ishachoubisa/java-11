public class TestPerson {
    public static void main(String[] args) {
        Person joe = new Person("JOE","55");
        Person deb = new Person("DEB","85");
        Person ann = new Person();
        System.out.println(joe);
        System.out.println(deb);
        System.out.println("------Ann Before------");
        System.out.println(ann);
        ann.setAge("21");
        ann.setInstanceName("ANN");

        System.out.println("-----Ann After------");
        System.out.println(ann);
    }
}
