package JavaPracticeGitHub.C34_Comparable_Comparator;

import java.util.*;

public class MainTreeSet {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<Student>(new Comparator<Student>() {
            public int compare(Student firstStudent, Student secondStudent) {
                if (secondStudent.getAverage() != firstStudent.getAverage()) {
                    if (secondStudent.getAverage() > firstStudent.getAverage()) {
                        return 1;
                    }
                    return -1;
                }
                if (firstStudent.getLastName().compareTo(secondStudent.getLastName()) != 0) {
                    if (firstStudent.getLastName().compareTo(secondStudent.getLastName()) > 0) {
                        return 1;
                    }
                    return -1;
                }


                return firstStudent.getFirstName().compareTo(secondStudent.getFirstName());
            }
        });
        students.add(new Student("Andrei", "Georgescu", 9.5));
        students.add(new Student("Ioana", "Grama", 7.2));
        students.add(new Student("Mihai", "Chioveanu", 6.8));
        students.add(new Student("Ionel", "Georgescu", 9.5));
        students.add(new Student("Elena", "Avram", 5.1));
        students.add(new Student("Mihai", "Chioveanu", 6.8));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
