package JavaPracticeGitHub.Algorithms;

public class MaxConsecutiveOnes485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                count++;
            }
            else{
                count = 0;
                if(nums.length - 1 < max){
                    return max;
                }
            }
            if(count > max){
                max = count;
            }
        }
        return max;


    }
}
