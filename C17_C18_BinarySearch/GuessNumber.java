package JavaPracticeGitHub.C17_C18_BinarySearch;

public class GuessNumber {

    public static int guess(int num){
        int n = 30;
        if(num == n){
            return 0;
        }else if(num < n){
            return -1;
        }else {
            return 1;
        }
    }

    public static int guessNumber(int n) {
        int l = 1, r = n;
        while(l <= r){
            int mid = (r - l) / 2 + l;
            if(guess(mid) == 0){
                return mid;
            }else if(guess(mid) == -1){
                r = mid - 1;
            }else if(guess(mid) == 1){
                l = mid + 1;
            }
        }
        return -1;
    }
}
