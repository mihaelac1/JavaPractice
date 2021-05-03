package JavaPracticeGitHub.C22_LinkedList.Exercitii;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Exercitiul2 {

    public static List<Integer> removeDuplicates(List<Integer> list){
        ListIterator<Integer> it = list.listIterator();
        Object obj1 = it.next();
        while(it.hasNext()){
            Object obj2 = it.next();
            int x = ((Integer) obj1).compareTo((Integer) obj2);
            while (x == 0)
            {
                it.remove();
                if(it.hasNext()) {
                    obj2 = it.next();
                    x = ((Integer) obj1).compareTo((Integer) obj2);
                }else{
                    x = -1;
                }
            }
            obj1 = obj2;
        }

        return list;
    }

    public static List<Integer> removeDuplicates2(List<Integer> list){
        ListIterator<Integer> it = list.listIterator();
        Object obj1 = it.next();
        while(it.hasNext()){
            Object obj2 = it.next();
            int x = ((Integer) obj1).compareTo((Integer) obj2);
            while (x == 0)
            {
                it.previous();
                it.remove();

                if(it.hasPrevious()) {
                    it.previous();
                }

                if(it.hasNext()) {
                    obj2 = it.next();
                    x = ((Integer) obj1).compareTo((Integer) obj2);
                }else{
                    x = -1;
                }
            }
            obj1 = obj2;
        }

        return list;
    }

    public static void main(String[] args) {
//        List<Integer> myList = new LinkedList<>();
        List<Integer> myList = new ArrayList<>();

        myList.add(1);
        myList.add(2);
        myList.add(2);
        myList.add(9);
        myList.add(9);
        myList.add(10);
        myList.add(10);
        myList.add(15);
        myList.add(20);
        myList.add(20);
        myList.add(25);

        List<Integer> linkedListRemove1 = new LinkedList<>(myList);
        List<Integer> linkedListRemove2 = new LinkedList<>(myList);

        //keep non-duplicates in the list
        System.out.println("keep non-duplicates in the list");
        System.out.println("Before removing duplicates: " + linkedListRemove1);
        removeDuplicates(linkedListRemove1);
        System.out.println("After keeping only non duplicates: " + linkedListRemove1);
        System.out.println();
        System.out.println("Initial list: " + myList);

        System.out.println("remove all duplicates in the list");
        System.out.println("Before removing all duplicates: " + linkedListRemove2);
        removeDuplicates2(linkedListRemove2);
        System.out.println("After removing all duplicates: " + linkedListRemove2);

        System.out.println();
        System.out.println("Initial list: " + myList);

    }
}
