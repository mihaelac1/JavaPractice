package JavaPracticeGitHub.C4_BaseConceptsOOP;

public class Main {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle(2009, "1M8GDM9AXKP042788", "B230GHJ", 10500, 2020,56,20);
        car1.display();
        car1.printVinDecomposed();
        System.out.println(car1.isVinValid(true));
        car1.changePosition(89, 32);
        car1.display();
        car1.sellVehicle("CT23ABC", 2021);
        car1.display();
        System.out.println(Vehicle.producedBy);
        System.out.println(car1.getPlateNumber());
        System.out.println(car1.getKilometers());
        System.out.println(car1.getVin());
        System.out.println(car1.getProductionYear());
        car1.setPlateNumber("BZ24WWW");
        System.out.println(car1.getPlateNumber());
        car1.display();

    }
}
