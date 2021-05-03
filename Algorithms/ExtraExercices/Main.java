package JavaPracticeGitHub.Algorithms.ExtraExercices;

public class Main {
    public static void main(String[] args) {
        GenericPackage colet1 = new GenericPackage("213142341425", "DevCarry", 4.2 );
        System.out.println(colet1.computeDetails());
        System.out.println(colet1.checkID());
        colet1.addItem(6.8);
        System.out.println(colet1.computeDetails());
        GenericPackage.setCourierName("Cargus");
        System.out.println(colet1.computeDetails());
    }
}
