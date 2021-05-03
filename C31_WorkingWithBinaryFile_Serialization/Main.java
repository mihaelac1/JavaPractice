package JavaPracticeGitHub.C31_WorkingWithBinaryFile_Serialization;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("mihaela", "calin", 1989, true, 100);
        Person person2 = new Person("daniel", "andrei", 1989, true, 200);
        Person person3 = new Person("tudor", "matei", 2019, false, 0);
        List<Person> myList = new ArrayList<>();
        myList.add(person1);
        myList.add(person2);
        myList.add(person3);
        Person.writeToBinaryFile(myList);

        List<Person> mySecondList = Person.readFromBinaryFile();
        System.out.println("my second list: ");
        System.out.println(mySecondList);
    }
}
