package JavaPracticeGitHub.Algorithms;

import java.util.Arrays;

public class SearchRange34 {
    public int[] searchRangeBruteForce(int[] nums, int target) {
        int[] myArray = new int[2];
        int firstIndex = -1;
        int lastIndex = -1;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                if(firstIndex == -1){
                    firstIndex = i;
                }
                firstIndex = Math.min(firstIndex, i);
                lastIndex = Math.max(lastIndex, i);
            }
        }

        myArray[0] = firstIndex;
        myArray[1] = lastIndex;

        return myArray;
    }
    public static int[] searchRangeOptimised(int[] nums, int target) {
        int[] myArray = {-1, -1};
        int firstIndex;
        int lastIndex;
        int l = 0; int r = nums.length - 1;

        while(r >= l){
            int mid = (l + r) / 2;
            if(nums[mid] == target){
                firstIndex = mid;
                lastIndex = mid;
                int i = mid;
                while(nums[i] == target){
                    firstIndex = i;
                    i--;
                }
                i= mid;
                while(nums[i] == target){
                    lastIndex = i;
                    i++;
                }
                myArray[0] = firstIndex;
                myArray[1] = lastIndex;
                return myArray;

            }else if(nums[mid] < target){
                l = mid;
            }else if(nums[mid] > target){
                r = mid;
            }
            if(r - l == 1 && nums[r] != target && nums[l] != target){
                return myArray;
            }
        }

        return myArray;
    }

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 1;
        System.out.println(Arrays.toString(searchRangeOptimised(nums, target)));
    }

}
