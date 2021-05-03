package JavaPracticeGitHub.C8_Inheritance;

public class Vehicle {
    private final String serialNumber;
    private int noPerson;
    private String name;

    protected Vehicle(String serialNumber, int noPerson, String name){
        this(serialNumber, noPerson);
        this.name = name;
    }
    protected Vehicle(String serialNumber, int noPerson){
        this.serialNumber = serialNumber;
        this.noPerson = noPerson;
    }

    protected final String getSerialNumber() {
        return serialNumber;
    }

    protected boolean goTo(double positionX, double positionY){
        System.out.println("Error: unknown vehicle cannot move…");
        return false;
    }
    protected boolean addFuel(double amount){
       System.out.println("Error: unknown type of vehicle…");
       return false;
   }
   protected void printInfo(){
        System.out.println("Vehicle properties: \n" + "\t - serial number: " + this.serialNumber + "\n\t - capacity: " +
            this.noPerson + " person\n" +  "\t - name: " + this.name);
   }

}
