package JavaPracticeGitHub.Algorithms;

import java.util.Arrays;

public class MergeSortedArray88 {

    private static void mergeLong(int[] nums1, int m, int[] nums2, int n){
        if(nums1.length != m + n && n + m > 200 && m + n < 1 && n <  0 && n > 200 && m < 0 && m > 200 && nums2.length != n)
            return;
        int j = 0;

        for(int i = m; i < m + n; i++, j++)
            nums1[i] = nums2[j];

        Arrays.sort(nums1);

    }
    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int leftIndex = m - 1;
        int rightIndex = n - 1;

        int indexArray = m + n - 1;
        while(leftIndex >= 0 && rightIndex >= 0) {
            nums1[indexArray--] = (nums1[leftIndex] > nums2[rightIndex]) ? nums1[leftIndex--] : nums2[rightIndex--];
        }
        while(rightIndex > 0){
            nums1[indexArray--] = nums2[rightIndex--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
