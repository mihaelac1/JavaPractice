package JavaPracticeGitHub.Algorithms;

public class findLengthOfLCIS674 {
    public int findLengthOfLCIS(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int max = 1;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - nums[i - 1] > 0){
                count++;
            }
            else{
                count = 1;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}
