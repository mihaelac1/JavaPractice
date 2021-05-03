package JavaPracticeGitHub.C22_LinkedList.Exercitii;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class RotateListLinkedList {
    public static LinkedList<Integer> rotateRight(LinkedList<Integer> list, int k) {
        if(list.size() == 0){
            return list;
        }

        LinkedList<Integer> result = new LinkedList<>();

        k = list.size() - (k % list.size());

        ListIterator<Integer> it = list.listIterator();
        int count = 1;
        while(it.hasNext() && count <= k){
            it.next();
            count++;
        }
        ListIterator<Integer> it2 = list.listIterator();

        while(it.hasNext()){
            result.add(it.next());
        }

        count = 1;
        while(it2.hasNext() && count <= k){
            result.add(it2.next());
            count++;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        int k = 10;
        System.out.println(rotateRight(list1, k));
    }
}
