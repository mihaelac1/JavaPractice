package JavaPracticeGitHub.C22_LinkedList.ExempleCurs;

import java.util.*;

public class Test {

    public static int countOccurrences(Iterable<String> list, String key) {
        int counter = 0;
        for(Iterator<String>it = list.iterator(); it.hasNext(); ) {
            if (it.next().equals(key)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new LinkedList<>(Arrays.asList(1, 5, 6, 7, 6));
//        Iterator itArrayList = 0;
        int key = 6;
        int count = 0;
        for(Iterator<Integer> it = integerList.iterator(); it.hasNext(); ){
            if(it.next() == key){
                count++;
            }
        }

        System.out.println(count);

    }
}
