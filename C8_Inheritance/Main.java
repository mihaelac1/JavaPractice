package JavaPracticeGitHub.C8_Inheritance;

public class Main {
    public static void main(String[] args) {
        //testing class vehicle
        System.out.println("\t Testing class vehicle");
        Vehicle vehicle1 = new Vehicle("12542", 5, "Roy");
        vehicle1.goTo(45.5, 21.3);
        vehicle1.addFuel(2.3);
        vehicle1.printInfo();
        System.out.println("Serial number: " + vehicle1.getSerialNumber());

        //testing class OnRoad
        System.out.println("\n\t Testing class onRoad");
        OnRoad car = new OnRoad("6522", 5, "Roy",5,4);
        car.goTo(25.3, 34.2);
        car.addFuel(6.3);
        car.printInfo();
        OnRoad car2 = new OnRoad("6522", 5, "Car2",6);
        car2.printInfo();

        //testing class OnWater
        System.out.println("\n\t Testing class onWater");
        OnWater boat = new OnWater("62542", 20, "SailingBoat", 5, 600.2);
        boat.goTo(25.3, 34.2);
        boat.addFuel(6.3);
        boat.printInfo();

        //testing class OnAir
        System.out.println("\n\t Testing class onAir");
        OnAir airplane = new OnAir("8721VDc22", 120, "BlueFly", 4, false);
        airplane.goTo(25.3, 34.2);
        airplane.addFuel(6.3);
        airplane.printInfo();


    }
}
