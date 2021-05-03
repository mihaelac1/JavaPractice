package JavaPracticeGitHub.Algorithms;

public class ProductExceptSelf238 {
    public int[] productExceptSelV1(int[] nums) {
        int[] myNewArray = new int[nums.length];

        int[] L = new int[nums.length];
        int[] R = new int[nums.length];

        L[0] = 1;
        for(int i = 1; i < nums.length; i++){
            L[i] = L[i - 1] * nums[i - 1];
        }
        R[nums.length - 1] = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            R[i] = R[i + 1] * nums[i + 1];
        }
        for(int i = 0; i < nums.length; i++){
            myNewArray[i] = L[i] * R[i];
        }



        return myNewArray;
    }
    public int[] productExceptSelV2(int[] nums) {
        int[] myResult = new int[nums.length];

        myResult[0] = 1;
        for(int i = 1; i < nums.length; i++){
            myResult[i] = myResult[i - 1] * nums[i - 1];
        }
        int R = 1;

        for(int i = nums.length - 1; i >= 0; i--){
            myResult[i] = myResult[i] * R;
            R = R * nums[i];
        }
        return myResult;

    }
}
