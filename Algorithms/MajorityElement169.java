package JavaPracticeGitHub.Algorithms;

import java.util.*;

public class MajorityElement169 {
    private static int majorityElement(int[] nums) {
        int n = nums.length;
        if(nums == null || n == 0)
            return -1;
        if(n == 1){
            return nums[0];
        }
        int count = 1;
        int maxCount = 1;
        int majElement = -1;
        Set <Integer> set = new HashSet<>();
        for(int i = 0; i < n - 1; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                for (int j = i + 1; j < n; j++) {
                    if (nums[i] == nums[j])
                        count++;
                }
                if (count > maxCount) {
                    maxCount = count;
                    count = 1;
                    majElement = nums[i];
                }
            }
        }
        if(maxCount > n / 2)
            return majElement;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
