package JavaPracticeGitHub.C5_ArrayList;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(5, 3, 2, 2, 3));
        //void add(int index, E element)
        arrayList1.add(6);
        System.out.println(arrayList1);

        //boolean add(E element)
        arrayList1.add(Integer.valueOf(8));
        System.out.println(arrayList1);

        //int size()
        System.out.println(arrayList1.size());

        //boolean contains(Object o)
        System.out.println("Contains 2? -> " + arrayList1.contains(2));

        //E get(int index)
        System.out.println("Get element in position 1 ->  " + arrayList1.get(1));

       // int indexOf(Object o)
        System.out.println("First Index of element 2 ->  " + arrayList1.get(2));

        //int lastIndexOf(Object o)
        System.out.println("Last Index of element 2 ->  " + arrayList1.get(2));

        // boolean remove(Object o)
        arrayList1.remove(Integer.valueOf(8));

       // E remove(int index)
        arrayList1.remove(1);

        // E set(int index, E element)
        arrayList1.set(0, 60);
        System.out.println(arrayList1);
       // void clear()
        arrayList1.clear();
        System.out.println("After clear -> " + arrayList1);



    }
}
