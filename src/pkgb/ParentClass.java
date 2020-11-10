package pkgb;

import pkga.SuperClass;

class PackageBClass{
    void testAccess(){
        SuperClass c = new SuperClass();
        System.out.println("A non sub-class class in a different package"+ "has only access to public class's public fields ");
        System.out.println("- SuperClass().publicInt = "+ c.publicInt);
    }
}

public class ParentClass extends SuperClass {
    public static void main(String[] args) {
        new PackageBClass().testAccess();
        new ParentClass().testAccess();
    }

        void testAccess(){
            System.out.println(this.getClass().getName()+ " has access to only it's parents public and protected" + "attributes if it declare in another package: ");
            System.out.println("- this.publicInt = "+ this.publicInt);
            System.out.println("- this.protectedInt = "+ this.protectedInt);
            System.out.println("- super.protectedInt = " + super.protectedInt);

            System.out.println("- new ParentClass().protectedInt = "+ new ParentClass().protectedInt);

            //System.out.println("- new SuperClass().protectedInt = "+ new SuperClass().protectedInt);
            System.out.println("- new SuperClass().protectedInt not available " + " through SuperClass instance in " + this.getClass().getName());
    }
}
