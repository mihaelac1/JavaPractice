package JavaPracticeGitHub.C22_LinkedList.Exercitii;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MergeTwoSortedListLinkedList {

    public static List<Integer> mergeTwoLists(List<Integer> l1, List<Integer> l2) {

        if(l1.size() == 0){
            return l2;
        }

        if(l2.size() == 0){
            return l1;
        }

        if(l1.size() == 0 && l2.size() == 0){
            return null;
        }

        ListIterator<Integer> itList1 = l1.listIterator();
        ListIterator<Integer> itList2 = l2.listIterator();

        List<Integer> result = new LinkedList<>();

        int val1 = itList1.next();
        int val2 = itList2.next();

        while(itList1.hasNext() && itList2.hasNext()){
            if(val1 <= val2){
               result.add(val1);
               val1 = itList1.next();
            }
            else{
                result.add(val2);
                val2 = itList2.next();
            }
        }

        while(itList1.hasNext()){
            result.add(itList1.next());
        }

        while(itList2.hasNext()){
            result.add(itList2.next());
        }
        return result;
    }

    public static void main(String[] args) {
//        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 3, 9, 15));
//        LinkedList<Integer> list2 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 6, 9, 20, 20));
        System.out.println(mergeTwoLists(list1, list2));
    }
}
