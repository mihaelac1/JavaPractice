package JavaPracticeGitHub.C26_HashTable;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> myMap= new HashMap<>();

        int[] result = new int[2];

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(myMap.containsKey(diff)){
                result[0] = myMap.get(diff);
                result[1] = i;
                return result;
            }

            myMap.put(nums[i], i);

        }
        return result;
    }
}
