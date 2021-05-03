package JavaPracticeGitHub.C34_Comparable_Comparator;

public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private double average;

    Student(String first, String last, Double average) {
        this.firstName = first;
        this.lastName = last;
        this.average = average;
    }

    @Override
    /*
     * Aici vom adauga logica de sortare. Aceasta metoda va sorta
     * automat dupa lastName prima data. In caz de egalitate, va
     * sorta dupa firstName. Daca si aici campurile sunt egale
     * ordonarea se va face dupa medie.
     */
    public int compareTo(Student other) {
        int comparingLastNames = this.lastName.compareTo(other.lastName);
        if (comparingLastNames != 0) {
            return comparingLastNames;
        }

        // in cazul in care lastName este acelasi comparam dupa firstName
        int comparingFirstNames = this.firstName.compareTo(other.firstName);
        if (comparingFirstNames != 0) {
            return comparingFirstNames;
        }

        // in final, in cazul in care si firstName este acelasi, comparam dupa medie
        int comparingAverages = ((Double)this.average).compareTo((Double)(other.average));
        return comparingAverages;
    }

    @Override
    public String toString() {
        return "Student{" + firstName + '\''
                + lastName + '\'' + average +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getAverage() {
        return average;
    }
}
