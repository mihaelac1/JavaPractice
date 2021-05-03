package JavaPracticeGitHub.C8_Inheritance;

public class OnWater extends Vehicle {

    private int noEngines;
    private double cargoCapacity;

    protected OnWater(String serialNumber, int noPerson){
        super(serialNumber, noPerson);
        this.noEngines = 2;
    }
    protected OnWater(String serialNumber, int noPerson, String name){
        super(serialNumber, noPerson, name);
        this.noEngines = 2;
    }
    protected OnWater(String serialNumber, int noPerson, String name, int noEngines){
        super(serialNumber, noPerson, name);
        this.noEngines = noEngines;
    }
    protected OnWater(String serialNumber, int noPerson, String name, int noEngines, double cargoCapacity){
        this(serialNumber, noPerson, name, noEngines);
        this.cargoCapacity = cargoCapacity;
    }
    @Override
    protected boolean goTo(double positionX, double positionY){
        System.out.println("Sailing the vessel to coordinates: [" + positionX + ", " + positionY + "]");
        return true;
    }
    @Override
    protected boolean addFuel(double amount){
        System.out.println("Adding " +  amount + " l of fuel to the vessel");
        return true;
    }
    @Override
    protected void printInfo(){
        super.printInfo();
        System.out.println("Vessel properties: \n" + "\t - number of engines: " + this.noEngines + "\n\t - cargo capacity: " +
                this.cargoCapacity);
    }


}
