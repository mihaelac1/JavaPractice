package JavaPracticeGitHub.C25_StackQueue;

import java.util.ArrayList;

public class NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

            ArrayList<Integer> result = new ArrayList<>();

            for(int i = 0; i < nums1.length; i++){
                int k = 0;
                for(int j = 0; j < nums2.length; j++){
                    if(nums1[i] == nums2[j]){
                        k = j;
                        break;
                    }
                }

                boolean found = false;

                for(k = k; k < nums2.length; k++){
                    if(nums2[k] > nums1[i]){
                        result.add(nums2[k]);
                        found = true;
                        break;
                    }
                }
                if(!found){
                    result.add(-1);
                }
            }
            return result.stream().mapToInt(value -> value).toArray();
        }
}
