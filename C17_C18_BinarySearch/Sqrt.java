package JavaPracticeGitHub.C17_C18_BinarySearch;

public class Sqrt {

    public int mySqrt(int x) {
        int l = 1, r = x;
        while(l <= r){
            int mid  = (l + r) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l - 1;
    }
}
