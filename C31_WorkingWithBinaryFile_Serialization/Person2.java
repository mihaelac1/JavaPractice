package JavaPracticeGitHub.C31_WorkingWithBinaryFile_Serialization;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class Person2 implements Serializable {

    private String firstName;
    private String secondName;
    private int birthYear;
    private boolean isMarried;
    private double netIncome;

    // version ID used for serialization
    private static final long serialVersionUID = 2L;

    public Person2(String firstName, String secondName, int birthYear,
                  boolean isMarried, double netIncome) {
        super();
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.isMarried = isMarried;
        this.netIncome = netIncome;
    }

    public static void writeToBinaryFile(List<Person> data) throws IOException{
        try(ObjectOutputStream binaryFileOut = new ObjectOutputStream(
                new BufferedOutputStream(new FileOutputStream("person.dat")))) {
            binaryFileOut.writeObject(data);
        }
    }

    public static List<Person> readFromBinaryFile() throws IOException {
        List<Person> data = null;

        try(ObjectInputStream binaryFileIn = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("person.dat")))) {
            data = (List<Person>) binaryFileIn.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println("A class not found exception: " + e.getMessage());
        }

        return data;
    }

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ", secondName=" + secondName + ", birthYear=" + birthYear + ", isMarried="
                + isMarried + ", netIncome=" + netIncome + "]";
    }
}