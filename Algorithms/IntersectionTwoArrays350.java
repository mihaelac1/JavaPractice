package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class IntersectionTwoArrays350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int cnt1 = 0;
        int cnt2 = 0;
        ArrayList<Integer> myList = new ArrayList<>();
        while(cnt1 < nums1.length && cnt2 < nums2.length){
            if(nums1[cnt1] > nums2[cnt2]){
                cnt2++;
            }else if(nums1[cnt1] < nums2[cnt2]){
                cnt1++;
            }else {
                myList.add(nums1[cnt1]);
                cnt1++;
                cnt2++;
            }
        }
        int[] myArray = new int[myList.size()];
       for(int i = 0; i < myArray.length; i++){
           myArray[i] = myList.get(i);
       }

        return myArray;

    }
}
