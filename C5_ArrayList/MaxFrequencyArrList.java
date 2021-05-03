package JavaPracticeGitHub.C5_ArrayList;

import java.util.*;

public class MaxFrequencyArrList {
    private static ArrayList<String> maxFrequency(ArrayList<String> arrayList){
        ArrayList<String> elementsMaxFrequency = new ArrayList<String>();
        int maxFreq = Integer.MIN_VALUE;
        for(int i = 0; i < arrayList.size(); i++) {
            int countFreq = 0;
            String currentElement = arrayList.get(i).toString();
            while(arrayList.contains(currentElement)){
                countFreq++;
                arrayList.remove(currentElement);
            }
            if(countFreq >= maxFreq){
                if(countFreq > maxFreq) {
                    elementsMaxFrequency.clear();
                }
                elementsMaxFrequency.add(currentElement);
                maxFreq = countFreq;
            }

        }

        return elementsMaxFrequency;
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList("a", "e", "a","e","c", "d", "c", "c","c", "a", "a","e","e"));
        System.out.println(maxFrequency(arrayList));
    }
}
