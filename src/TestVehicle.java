
class Motorcycle extends Vehicle{
    public Motorcycle(VehicleType type,String owner,String make){
        super(type,owner,make);
    }
    public void drive(){
        System.out.println("Kick up stand. Go");
    }
    public void park(){
        System.out.println("Put down stand");
    }
    public void makeNoise(){
        System.out.println("Zoom!");
    }
}

public class TestVehicle {
    public static void main(String[] args) {
        Auto car = new Auto(Vehicle.VehicleType.Automobile,"Allen","Ford");
        AutomatedAuto automatedCar = new AutomatedAuto(Vehicle.VehicleType.Automobile,"Martha","Tesla");
        Motorcycle harley = new Motorcycle(Vehicle.VehicleType.Motorcycle,"Buzz","Harley-Davidson");

        drive(car);
        drive(automatedCar);
        drive(harley);

        park(car);
        park(automatedCar);
        park(harley);
    }
    public static void drive(Vehicle v){
        System.out.print(v.getClass().getName() + " drive() : ");
        v.drive();
    }
    public static void park(Vehicle v){
        System.out.print(v.getClass().getName() + " park() : ");
        v.park();
    }
}
