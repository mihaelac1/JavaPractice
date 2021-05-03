package JavaPracticeGitHub.Algorithms;

public class ContainerWithMostWater11 {
    public static int maxAreaBruteForce(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        for(int i = 0; i < height.length; i++){
            for(int j = i; j < height.length; j++){
                maxArea = Math.max(maxArea, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return maxArea;
    }
    public static int maxAreaTwoPointers(int[] height) {
        int maxArea = 0, l = 0, r = height.length - 1;
        while(l < r){
            maxArea = Math.max(maxArea, Math.min(height[l], height[r]) * (r - l));
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxAreaTwoPointers(height));
    }
}
