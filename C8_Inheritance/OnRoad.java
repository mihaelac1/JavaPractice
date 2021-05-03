package JavaPracticeGitHub.C8_Inheritance;

public class OnRoad extends Vehicle {
    private int noWheels;
    private int noDoors;

    protected OnRoad(String serialNumber, int noPersons){
        super(serialNumber,noPersons);
        this.noDoors = 4;
        this.noWheels = 4;
    }

    protected OnRoad(String serialNumber, int noPersons, String name){
        super(serialNumber,noPersons, name);
        this.noDoors = 4;
        this.noWheels = 4;
    }

    protected OnRoad(String serialNumber, int noPersons, String name, int noWheels){
        this(serialNumber,noPersons, name);
        this.noWheels = noWheels;
    }

    protected OnRoad(String serialNumber, int noPersons, String name, int noWheels, int noDoors){
        this(serialNumber,noPersons, name, noWheels);
        this.noDoors = noDoors;
    }

    @Override
    protected boolean goTo(double positionX, double positionY){
        System.out.println("Driving the vehicle on road to coordinates: [" + positionX + ", " + positionY + "]");
        return true;
    }

    @Override
    protected boolean addFuel(double amount){
        System.out.println("Adding " +  amount + " l of fuel to the driving vehicle");
        return true;
    }

    @Override
    protected void printInfo(){
        super.printInfo();
        System.out.println("Driving vehicle properties: \n" + "\t - number of wheels: " + this.noWheels + "\n\t - number of doors: " +
                this.noDoors);
    }

}
