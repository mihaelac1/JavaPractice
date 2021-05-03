package JavaPracticeGitHub.C17_C18_BinarySearch;

public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num){
        int l = 0, r = num;

        while(l <= r){
            int mid  = (r - l) / 2 + l;
            long pow = (long) mid * mid;

            if(pow == num){
                return true;
            }else if(pow > num){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 121;
    }
}
