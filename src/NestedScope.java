public class NestedScope {
    public static void main(String[] args) {
        int i = 10;
        class locallyDefinedClass {
            {
                System.out.println("value of i before loop " + i);
                System.out.println("-------------");
                for (int i = 0; i < 5; i++) {
                    System.out.println("value of i during first loop " + i);
                }
                System.out.println("--------------");
                for (int i = 5; i > 0; i--) {
                    System.out.println("value of i during second loop " + i);
                }
                System.out.println("--------------");
                for (int j = 0; j < 15; j++) {
                    System.out.println("value of i,j during third loop " + i + "," + j);
                }
                System.out.println("value of i after loop " + i);
            }
        }
        System.out.println("value i before local class instantiated "+i);
        new locallyDefinedClass();
        System.out.println("value i after local class instantiated "+i);
    }
    }

