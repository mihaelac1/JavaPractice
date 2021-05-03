package JavaPracticeGitHub.Algorithms;

public class MaximumSubarray53 {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
           if(sum + nums[i] < nums[i]){
               sum = 0;
           }
           sum += nums[i];
           if(sum > max){
               max = sum;
           }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}
