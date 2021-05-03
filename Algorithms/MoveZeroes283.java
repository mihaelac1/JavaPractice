package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class MoveZeroes283 {

    public static void moveZeroes(int[] nums) {

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == 0){
                    nums[i] = nums[j];
                    nums[j] = 0;
                }
            }
        }
       System.out.println(Arrays.toString(nums));
    }
    public static void moveZeroesV2(int[] nums) {
        int nbZeros = 0;
        int lastIndex = 0;
        for(int i = 0; i < nums.length; i++){
           if(nums[i] == 0){
               nbZeros++;
           }
           else {
               nums[lastIndex] = nums[i];
               lastIndex++;
           }
        }
        for(int i = nums.length - nbZeros; i < nums.length; i++){
            nums[i] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        moveZeroesV2(nums);
    }
}
