package JavaPracticeGitHub.Algorithms;
//se mai poate realiza acest execitiu fie: sortand vectorul,
// fie folosind un hashset,
// fie aplicand forumula lui gauss, adunand primele n numere si scazand suma numerelor din vector (formula gauss: n(n + 1) / 2)
public class MissingNumber268 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i <= n; i++){
            boolean found = false;
            for(int j = 0; j < n; j++){
                if(nums[j] == i){
                    found = true;
                    break;
                }
            }
            if(!found){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0, 1}));
        System.out.println(missingNumber(new int[]{0, 1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(missingNumber(new int[]{0}));
    }
}
