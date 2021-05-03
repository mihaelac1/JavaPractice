package JavaPracticeGitHub.Algorithms;

import java.util.Scanner;

public class MaximumProductSubarray152 {

    public static int maxProductV2(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
             int prod = 1;
            for(int j = i; j < nums.length; j++){
                prod = prod * nums[j];
                if(prod > max){
                    max = prod;
                }
            }
        }

        return max;
    }

    public static int maxProduct(int[] nums){
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];
        int temp;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                temp = max;
                max = min;
                min = temp;
            }
            max = Integer.max(nums[i], nums[i] * max);
            min = Integer.min(nums[i], nums[i] * min);
            ans = Integer.max(max, ans);
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = {-2,3,-4};
//        System.out.println(maxProduct(nums));
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        String str = in.nextLine();
        System.out.println("String " + str);
        System.out.println("Double " + x);
    }
}
