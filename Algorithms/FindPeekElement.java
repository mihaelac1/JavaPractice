package JavaPracticeGitHub.Algorithms;

import java.util.ArrayList;

public class FindPeekElement {
    public static int findPeakElement(int[] nums) {
        if(nums == null || nums.length < 1){
            return -1;
        }
        if(nums.length == 1){
            return 0;
        }
        ArrayList<Integer> myListValues = new ArrayList<>();
        ArrayList<Integer> myListIndex = new ArrayList<>();
        int index = -1;

        for(int i = 0; i < nums.length ; i++){
            if(i == 0 && nums[i] > nums[i + 1] && !myListValues.contains(nums[i])){
                index = i;
                myListValues.add(nums[i]);
                myListIndex.add(index);
            }else if(i == nums.length - 1 && nums[i] > nums[i - 1] && !myListValues.contains(nums[i])){
                index = i;
                myListValues.add(nums[i]);
                myListIndex.add(index);
            }else if(i != 0 && i != nums.length - 1 && nums[i] > nums[i - 1] && nums[i] > nums[i + 1] && !myListValues.contains(nums[i])){
                index = i;
                myListValues.add(nums[i]);
                myListIndex.add(index);
            }
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < myListValues.size(); i++ ){
            if( myListValues.get(i) >= max){
                index = i;
            }
        }
        return myListIndex.get(index);
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(findPeakElement(nums));
    }
}
