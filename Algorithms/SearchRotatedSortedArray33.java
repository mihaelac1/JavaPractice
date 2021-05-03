package JavaPracticeGitHub.Algorithms;

public class SearchRotatedSortedArray33 {
    public static int searchBruteForce(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        return -1;
    }
    public static int searchOptimised(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[l] <= nums[mid]) {
                if (target >= nums[l] && target < nums[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[r]) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3};
        System.out.println(searchOptimised(nums, 3));
    }
}
