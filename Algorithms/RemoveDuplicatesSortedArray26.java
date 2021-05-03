package JavaPracticeGitHub.Algorithms;

public class RemoveDuplicatesSortedArray26 {

    public static int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0){
            return 0;
        }
        int newNumsLength = 0;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[newNumsLength]){
                newNumsLength++;
                nums[newNumsLength] = nums[i];
                }
            }

        return newNumsLength + 1;

    }


    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int len = removeDuplicates(nums);
        for(int i = 0; i < len; i++){
            System.out.println(nums[i]);
        }

    }
}
