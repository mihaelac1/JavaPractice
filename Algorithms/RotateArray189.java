package JavaPracticeGitHub.Algorithms;

import java.util.Arrays;

public class RotateArray189 {
    public static void reverseArray(int[] nums){
        int i = 0;
        while(i < nums.length / 2){
            int aux = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = nums[i];
            nums[i] = aux;
            i++;
        }
    }

    public static void rotate(int[] nums, int k){
        if(nums == null || nums.length < 1 || k == 0){
            return;
        }
        int[] nums2 = new int[nums.length];
        if(k > nums.length){
            k = k - nums.length % k;
        }
        for(int i = 0; i < k; i++){
            nums2[i] = nums[nums.length - k + i];
        }
        for(int i = k; i < nums.length; i++){
            nums2[i] = nums[i - k];
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums2[i];
        }
    }

    public static void rotateV2(int[] nums, int k){
        if(nums == null || nums.length < 1 || k == 0){
            return;
        }
        if(k > nums.length){
            k = k - nums.length % k;
        }
        int i = 0;
        while(i < k){
            int aux = nums[nums.length - 1];
            for(int j = nums.length - 1; j > 0; j--){
                nums[j] = nums[j - 1];
            }
            nums[0] = aux;
            i++;
        }


    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        int k = 3;
        rotateV2(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
