package JavaPracticeGitHub.C34_Comparable_Comparator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();
        students.add(new Student("Andrei", "Georgescu", 9.5));
        students.add(new Student("Ioana", "Grama", 7.2));
        students.add(new Student("Mihai", "Chioveanu", 6.8));
        students.add(new Student("Ionel", "Georgescu", 9.5));
        students.add(new Student("Elena", "Avram", 5.1));

        System.out.println(students);

//        Collections.sort(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student firstStudent, Student secondStudent) {
                if (firstStudent.getAverage() != secondStudent.getAverage()) {
                    if (firstStudent.getAverage() > secondStudent.getAverage()) {
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

//        Collections.sort(students, (firstStudent, secondStudent) -> {
//            if (firstStudent.getAverage() != secondStudent.getAverage()) {
//                if (firstStudent.getAverage() > secondStudent.getAverage()) {
//                    return 1;
//                }
//                return -1;
//            }
//            return firstStudent.getLastName().compareTo(secondStudent.getLastName());
//        });


        System.out.println("The sorted list:");
        System.out.println(students);
    }
}
