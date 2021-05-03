package JavaPracticeGitHub.C17_C18_BinarySearch;

public class SearchInsertPosition {

    public static int searchInsertPosition(int[] array, int key){
        int l = 0, r = array.length - 1;

        while(l <= r){
            int mid  = (r - l) / 2 + l;
            if(array[mid] == key){
                return mid;
            }else if(array[mid] > key){
                r = mid - 1;
            }else {
                l = mid + 1;
            }
        }
        return l;
    }
    public static void main(String[] args) {

    }
}
