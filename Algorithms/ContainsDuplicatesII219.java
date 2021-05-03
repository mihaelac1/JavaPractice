package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class ContainsDuplicatesII219 {

    private static <K, V> K getKey(Map<K, V> map, V value){
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    private static boolean containsNearbyDuplicate2(int[] nums, int k) {
        if(nums == null || nums.length == 0)
            return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
            map.put(0, nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(map.containsValue(nums[i])) {
                boolean f = false;
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (nums[i] == entry.getValue()) {
                        int c = Math.abs(i - entry.getKey());
                        if (Math.abs(i - entry.getKey()) <= k && f == false) {
                            f = true;
                        }
                    }
                    if (f == true) {
                        return true;
                    }
                }

            }
            map.put(i, nums[i]);
        }
        return false;
    }
    private static boolean containsNearbyDuplicate(int[] nums, int k){
        for(int i = 0; i < nums.length - 1; i ++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    if(j - i <= k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(nums, k));
    }
}
