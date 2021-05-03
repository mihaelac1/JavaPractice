package JavaPracticeGitHub.C34_Comparable_Comparator;

import java.util.*;

public class MainPQ {
    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return ((Double)o2.getAverage()).compareTo((Double)o1.getAverage());
            }
        });
        students.add(new Student("Andrei", "Georgescu", 9.5));
        students.add(new Student("Ioana", "Grama", 7.2));
        students.add(new Student("Mihai", "Chioveanu", 6.8));
        students.add(new Student("Ionel", "Georgescu", 9.5));
        students.add(new Student("Elena", "Avram", 5.1));
        students.add(new Student("Mihai", "Chioveanu", 6.8));

        while(!students.isEmpty()){
            System.out.println(students.poll());
        }
    }
}
