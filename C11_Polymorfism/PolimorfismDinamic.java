package JavaPracticeGitHub.C11_Polymorfism;
class Person {
    public void printStatus() {
        System.out.println("Unemployed");
    }
    public void describe() {
        System.out.println("I am a Person!");
    }
}

class Employee extends Person {
    @Override
    public void printStatus() {
        System.out.println("Employee");
    }
    @Override
    public void describe() {
        super.describe();
        System.out.println("I am also employed");
    }
}

public class PolimorfismDinamic {

    public static void main(String[] args) {
        Person pers1, pers2;
        pers1 = new Employee();
        pers2 = new Person();

        pers1.printStatus(); // prints "Employee"
        pers2.printStatus(); // prints "Unemployed"
        System.out.println();
        pers2.describe(); // prints "I am a Person!"
        System.out.println();
        pers1.describe(); // prints "I am a Person! \n I am also employed"
    }
}

