package JavaPracticeGitHub.C17_C18_BinarySearch;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;

        while(l <= r){
            int mid  = (r - l) / 2 + l;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
