package JavaPracticeGitHub.C11_Polymorfism;

public class PolimorfismStatic {

    public static void printVarWithType(String var) {
        System.out.println("String: " + var);
    }
    public static void printVarWithType(int var) {
        System.out.println("int: " + var);
    }
    public static void printVarWithType(double var) {
        System.out.println("double: " + var);
    }
    public static void printVarWithType(char var) {
        System.out.println("char: " + var);
    }
    public static void printVarWithType(boolean var) {
        System.out.println("boolean: " + var);
    }
    public static void printVarWithType(int var, String var2) {
        System.out.println("int + String: " + var + " " + var2);
    }
    public static void printVarWithType(int var, String var2, boolean var3) {
        System.out.println("int + String + boolean: " + var + " " + var2 + " " + var3);
    }

    public static void main(String[] args) {
        printVarWithType(23);
        printVarWithType("Nothing worth having " + "comes easy");
        printVarWithType(23 * 1.0);
        printVarWithType(4 / 2 == 1 * 2);
        printVarWithType('\u00AE');
        printVarWithType(5, "available places");
        printVarWithType(9, "exam passed", true);
    }
}
