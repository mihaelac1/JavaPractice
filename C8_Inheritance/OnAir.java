package JavaPracticeGitHub.C8_Inheritance;

public class OnAir extends Vehicle {
    private int noTurbines;
    private boolean hasFirstClass;

    protected OnAir(String serialNumber, int noPerson){
        super(serialNumber, noPerson);
        this.noTurbines = 2;
    }
    protected OnAir(String serialNumber, int noPerson, String name){
        super(serialNumber, noPerson, name);
        this.noTurbines = 2;
    }
    protected OnAir(String serialNumber, int noPerson, String name, int noTurbines){
        super(serialNumber, noPerson, name);
        this.noTurbines = noTurbines;
    }
    protected OnAir(String serialNumber, int noPerson, String name, int noTurbines, boolean hasFirstClass){
        this(serialNumber, noPerson, name, noTurbines);
        this.hasFirstClass = hasFirstClass;
    }

    @Override
    protected boolean goTo(double positionX, double positionY){
        System.out.println("Flying the airplane to coordinates: [" + positionX + ", " + positionY + "]");
        return true;
    }

    @Override
    protected boolean addFuel(double amount){
        System.out.println("Adding " +  amount + " l of fuel to the airplane");
        return true;
    }

    @Override
    protected void printInfo(){
        super.printInfo();
        System.out.println("Airplane properties: \n" + "\t - number of turbines: " + this.noTurbines);
        if(hasFirstClass) {
            System.out.println("\t - has first class");
        }
        else{
            System.out.println("\t - does not have first class");
        }
    }
}
