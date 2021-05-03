package JavaPracticeGitHub.C6_MyIntArrayList;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyIntArrayList array1 = new MyIntArrayList(3);
        array1.add(5);
        array1.add(20);
        array1.add(12);
        array1.display();
        System.out.println("Size array1: " + array1.size());

        MyIntArrayList array2 = new MyIntArrayList(array1);
        array2.display();

        MyIntArrayList array3 = new MyIntArrayList();
        System.out.println("Before clear array3: ");
        array3.display();
        array3.clear();
        System.out.println("After clear array3: ");
        array3.display();

        //Operation on array1
        array1.add(5);
        array1.display();
        array1.add(2, 60);
        array1.display();
        System.out.println("Size array1: " + array1.size());
        System.out.println("Contains method" + array1.contains(12));
        System.out.println("Get method: " + array1.get(1));
        System.out.println("IndexOf method: " + array1.indexOf(5));
        System.out.println("Last index method: " + array1.lastIndexOf(5));
        System.out.print("Before remove: ");
        array1.display();
        System.out.println("Size array1 before remove: " + array1.size());
        array1.remove(12);
        System.out.print("After remove: ");
        array1.display();
        System.out.println("Size array1 after remove: " + array1.size());

        System.out.println("Size array1 before remove: " + array1.size());
        array1.removeElementAtIndex(2);
        System.out.print("After remove: ");
        array1.display();
        System.out.println("Size array1 after remove: " + array1.size());

        array1.set(0,15);
        System.out.print("After set method: ");
        array1.display();

        array1.addAll(array2);
        System.out.print("After add the array2: ");
        array1.display();
        array1.removeElementAtIndex(3);
        System.out.println("After toArray method - array 1: " + Arrays.toString(array1.toArray()));
        System.out.println("Array1: " );
        array1.display();
        System.out.println("Before trim: ");
        array1.display();
        array1.trimToSize();
        System.out.println("After trim: ");
        array1.display();
        System.out.println("Before ensureCapacity method: ");
        array1.display();
        array1.ensureCapacity(6);
        System.out.println("After ensureCapacity method: ");
        array1.display();
        System.out.println("After toArray method - array 1: " + Arrays.toString(array1.toArray()));


    }
}
