package JavaPracticeGitHub.Algorithms;

import java.util.*;

public class NbApparitionStringArray {
//    Dandu-se un array de forma:
//            ["cristi", "are", "cristi", "devmind", "test", "test", "cristi"]
//
//    Afisati fiecare string urmat de numarul de aparitii ale acestuia in cadrul arrayului, sub forma:
//
//    cristi -> 3
//    are -> 1
//    devmind -> 1
//    test -> 2
//
//
//    Follow up: afisati elementele in ordine alfabetica

    public static Map<String, Integer> nbApparition(String[] array){
        Map<String, Integer> myMap = new LinkedHashMap<>();
        for(String str : array){
            if(myMap.containsKey(str)){
                myMap.put(str, myMap.get(str) + 1);
            }else{
                myMap.put(str, 1);
            }
        }

        return myMap;
    }

    public static void main(String[] args) {
        String[] array = {"cristi", "are", "cristi", "devmind", "test", "test", "cristi"};
        Map<String, Integer> myMap = nbApparition(array);
        //Original
        System.out.println(myMap);


        //using a treeMap
        System.out.println("\n using using a treeMap ---------------");
        TreeMap<String, Integer> sortedMap = new TreeMap<>(myMap);

        for (Map.Entry<String, Integer> set : sortedMap.entrySet()) {
            System.out.println(set.getKey() + " -> " + set.getValue());
        }

        System.out.println("\n using an array list : sorted key ---------------");
        //using an array list
        List<String> sortedArrayList = new ArrayList<>(myMap.keySet());
        Collections.sort(sortedArrayList);
        System.out.println(sortedArrayList);

        System.out.println("\nUsing stream------");
        myMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByKey())
                .forEach(System.out::println);
    }

}
