package JavaPracticeGitHub.Algorithms.ExtraExercices;

class GenericPackage {
    private final String uniqueID;
    private double weight;
    private String packageName;
    private static String courierName = "FanCourier";

    protected String getUniqueID() {
        return uniqueID;
    }

    protected static String getCourierName() {
        return courierName;
    }

    protected static void setCourierName(String courierName) {
        GenericPackage.courierName = courierName;
    }

    protected String getPackageName() {
        return packageName;
    }

    protected GenericPackage(String uniqueID, String packageName, double weight) {
        this(uniqueID, packageName);
        this.weight = weight;
    }

    protected GenericPackage(String uniqueID, String packageName) {
        this.uniqueID = uniqueID;
        this.packageName = packageName;
    }

    protected void addItem(double itemWeight){
        this.weight += itemWeight;
    }

    protected boolean checkID(){
        String id = this.uniqueID;
        return condition5(id) && condition1And2And3(id) && condition4(id);

    }

    private boolean condition5(String id){
        if(id.length() < 10 || id.length() > 12){
            return false;
        }
        return true;
    }

    private boolean condition1And2And3(String id){
        int nrCifreImpare = 0;
        int sumaCifreNumar = 0;
        for(int i = 0; i < id.length(); i++){
            if(!Character.isDigit(id.charAt(i))){
                return false;
            }
            int currentLetter = Integer.parseInt(String.valueOf(id.charAt(i)));
            sumaCifreNumar += sumaCifreNumar;
            if(currentLetter % 2 != 0){
                nrCifreImpare += 1;
            }
        }
        return (sumaCifreNumar % 4 == 0) && (nrCifreImpare % 3 ==0);
    }

    private boolean condition4(String id){
        for(int i = 0; i < id.length() - 1; i++) {
            int currentLetter = Integer.parseInt(String.valueOf(id.charAt(i)));
            int nextLetter = Integer.parseInt(String.valueOf(id.charAt(i + 1)));
            if(Math.abs(currentLetter - nextLetter) >= 5){
                return false;
            }

        }
        return true;
    }

    protected String computeDetails(){
        String details = "Pachetul " + this.packageName + " avand codul " + this.uniqueID + " si greutatea " + this.weight +
                " apartine curierului " + courierName;
        return details;
    }
}
