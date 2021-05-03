package JavaPracticeGitHub.C22_LinkedList.Exercitii;

import java.util.*;

public class BigNumbersLinkedList {

    public static LinkedList<Integer> sum(LinkedList<Integer> op1, LinkedList<Integer> op2) {
        Iterator<Integer> itList1 = op1.descendingIterator();
        Iterator<Integer> itList2 = op2.descendingIterator();
        LinkedList<Integer> sumOperators = new LinkedList<>();

        int memorator = 0;
        while (itList1.hasNext() && itList2.hasNext()) {
            int valList1 = itList1.next();
            int valList2 = itList2.next();
            int sum = (valList1 + valList2 + memorator) % 10;
            memorator = (valList1 + valList2 + memorator) / 10;
            sumOperators.add(sum);
        }
        while (itList1.hasNext()) {
            int val = itList1.next();
            sumOperators.add((val + memorator) % 10);
            memorator = memorator / 10;
        }

        while (itList2.hasNext()) {
            int val = itList2.next();
            sumOperators.add((val + memorator) % 10);
            memorator = memorator / 10;
        }

        if (memorator == 1) {
            sumOperators.add(1);
        }

        LinkedList<Integer> returnedSumOperators = new LinkedList<>();
        Iterator<Integer> it = sumOperators.descendingIterator();
        while (it.hasNext()) {
            returnedSumOperators.add(it.next());
        }

        return returnedSumOperators;
    }

    private static String noToString(int[] no) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < no.length; i++) {
            sb.append(no[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        BigNumbersLinkedList bn = new BigNumbersLinkedList();

        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(2, 1, 7, 8));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(9, 5, 9, 6));
        LinkedList<Integer> rez = bn.sum(list1, list2);

        System.out.println(rez);

    }
}

