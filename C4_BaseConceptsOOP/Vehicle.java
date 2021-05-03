package JavaPracticeGitHub.C4_BaseConceptsOOP;
import java.lang.*;

class Vehicle {
    protected static final String producedBy = "Volvo";
    private final int productionYear;
    private final String vin;
    private String plateNumber;
    private int kilometers;
    private int lastSoldOnYear;
    private int positionX;
    private int positionY;

    protected String getPlateNumber() {
        return plateNumber;
    }

    protected void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    protected int getKilometers() {
        return kilometers;
    }

    protected int getProductionYear() {
        return productionYear;
    }

    protected String getVin() {
        return vin;
    }

    protected Vehicle(int productionYear, String vin, String plateNumber, int kilometers, int lastSoldOnYear) {
        this.productionYear = productionYear;
        this.vin = vin;
        this.plateNumber = plateNumber;
        this.kilometers = kilometers;
        this.lastSoldOnYear = lastSoldOnYear;
    }

    protected Vehicle(int productionYear, String vin, int positionX, int positionY) {
        this.productionYear = productionYear;
        this.vin = vin;
        this.positionX = positionX;
        this.positionY = positionY;
    }

    protected Vehicle(int productionYear, String vin, String plateNumber, int kilometers, int lastSoldOnYear, int positionX, int positionY) {
        this(productionYear, vin, positionX, positionY);
        this.plateNumber = plateNumber;
        this.kilometers = kilometers;
        this.lastSoldOnYear = lastSoldOnYear;

    }

    protected void sellVehicle(String plateNumber, int lastSoldOnYear){
        this.plateNumber = plateNumber;
        this.lastSoldOnYear = lastSoldOnYear;
    }

    private int calculDistance(int xOld, int yOld, int xNew, int yNew){
        return (int)Math.sqrt(Math.pow(xNew - xOld,2) + Math.pow(yNew - yOld,2));
    }

    protected void changePosition(int xNew, int yNew){
        this.kilometers += calculDistance(this.positionX, this.positionY, xNew, yNew);
        this.positionX = xNew;
        this.positionY = yNew;
    }

    private boolean isDrivingInNorthAmerica(String vin){
        if(vin == null || vin.length() != 17){
            return false;
        }
        vin = vin.toUpperCase();
        int intCheckValue = 0;
        char check = vin.charAt(8);
        char year = vin.charAt(9);
        if(!Character.isDigit(check) && check != 'X'){
            return false;
        }
        else{
            if(check != 'X'){
                char[] d = new char[check];
                intCheckValue = (int)check;
            }
            else{
                intCheckValue = 10;
            }
        }

        StringBuilder translLetters = new StringBuilder("ABCDEFGHJKLMNPRSTUVWXYZ1234567890");
        StringBuilder translValue = new StringBuilder("123456781234579234567891234567890");
        int[] value = new int[vin.length()];
        int[] weight = {8, 7, 6, 5, 4, 3, 2, 10, 0, 9, 8, 7, 6, 5, 4, 3, 2};

        for(int i = 0; i < vin.length(); i++){
            int positionLetter = translLetters.indexOf(String.valueOf(vin.charAt(i)));
            if (positionLetter != -1) {
                value[i] = Integer.parseInt(String.valueOf(translValue.charAt(positionLetter)));
            }
            else{
                return false;
            }
            if(i == 9 && year == '0'){
                return false;
            }
        }
        int sumProduct = 0;
        for(int i = 0; i < vin.length(); i++){
            sumProduct += value[i] * weight[i];
        }
        if(sumProduct % 11 == 10) {
            return true;
        }
        return false;

    }

    protected boolean isVinValid(boolean isDrivingInNorthAmerica){
        if(isDrivingInNorthAmerica == false) {
            return true;
        }
        else {
            return isDrivingInNorthAmerica(this.vin);
        }

    }

    protected void printVinDecomposed(){
        String vin = this.vin;
        System.out.println("Identificatorul producatorului: " + vin.substring(0,3));
        System.out.println("Atributele vehiculului: " + vin.substring(3,8));
        System.out.println("Cifra de verificare: " + vin.substring(8,9));
        System.out.println("Anul productiei modelului: " + vin.substring(9,10));
        System.out.println("Seria fabricii: " + vin.substring(10,11));
        System.out.println("Identificatorul numeric: " + vin.substring(11));
    }
    protected void display(){
        System.out.println("Producatorul vehiculului este: " + this.producedBy + ", are anul fabricatiei: " + this.productionYear +
                ", VIN -ul : " + this.vin + "\n, numarul de inmatriculare: " + this.plateNumber +
                ", numarul de kilometrii parcursi de la fabricatie: " + this.kilometers + "\n, anul la care a fost vandut ultima " +
                "oara vehiculul: " + this.lastSoldOnYear + "\n, coordonata gps x: " + this.positionX + ", coordonata GPS y: " + this.positionY + ".");
    }
}
