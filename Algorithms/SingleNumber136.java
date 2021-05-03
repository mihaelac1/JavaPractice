package JavaPracticeGitHub.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber136 {
    public static int singleNumberV1(int[] nums) {

        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if(count == 1){
                return nums[i];
            }
        }
        return -1;
    }

    public static int singleNumberV2(int[] nums) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            myArrayList.add(nums[i]);
        }
        int i = 0;
        while(i < nums.length){
            if(myArrayList.indexOf(nums[i]) == myArrayList.lastIndexOf(nums[i])){
                return nums[i];
            }
            i++;
        }
        return Integer.MAX_VALUE;
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 1; i = i + 2){
            if(nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
