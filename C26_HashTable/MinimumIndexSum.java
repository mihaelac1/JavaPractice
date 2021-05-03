package JavaPracticeGitHub.C26_HashTable;
import java.util.*;

public class MinimumIndexSum {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> myMap = new HashMap<>();
        Map<String, Integer> resultMap = new HashMap<>();

        for(int i = 0; i < list1.length; i++){
            myMap.put(list1[i], i);
        }

        int leastIndex = Integer.MAX_VALUE;

        for(int i = 0; i < list2.length; i++){
            if(myMap.containsKey(list2[i])){
                resultMap.put(list2[i], myMap.get(list2[i]) + i);
                if(resultMap.get(list2[i]) < leastIndex){
                    leastIndex = resultMap.get(list2[i]);
                }
            }
        }

        // String[] resultString = new String[resultMap.size()];
        List<String> resultList = new ArrayList<>();

        int i = 0;

        for(Map.Entry mapElement : resultMap.entrySet()){
            if((int)mapElement.getValue() == leastIndex){
                resultList.add((String)mapElement.getKey());
            }
        }

        return resultList.toArray(new String[resultList.size()]);

    }
}
