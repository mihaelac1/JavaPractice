package JavaPracticeGitHub.C16_NestedClasses_LeetCode;

public class HouseRobber {

    public static int rob(int[] nums) {
        int dp1 = 0;
        int dp2 = 0;
        int maxValue = 0;
        for(int num : nums){
            maxValue = Math.max(dp2, num + dp1);
            dp1 = dp2;
            dp2 = maxValue;
        }
        return maxValue;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,9,3,1};
        System.out.println(rob(nums));
    }
}
