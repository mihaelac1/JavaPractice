package JavaPracticeGitHub.C27_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }

        Set<Integer> mySet = new HashSet<>();

        for(Integer nb : nums){
            if(mySet.contains(nb)){
                return true;
            }
            mySet.add(nb);
        }

        return false;

    }

    public boolean containsDuplicateV2(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i ++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
