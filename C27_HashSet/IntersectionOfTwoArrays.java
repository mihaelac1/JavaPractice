package JavaPracticeGitHub.C27_HashSet;

import java.util.*;

public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> mySet = new HashSet<>();
        Set<Integer> mySetResult = new HashSet<>();


        for(Integer nb : nums1){
            mySet.add(nb);
        }

        for(Integer nb : nums2){
            if(mySet.contains(nb)){
                mySetResult.add(nb);
            }
        }

        int[] result = new int[mySetResult.size()];

        int i = 0;
        for(Integer res : mySetResult){
            result[i++] = res;
        }

        return result;

    }

}
