package JavaPracticeGitHub.C26_HashTable;
import java.util.*;

public class LengthLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> myMap = new HashMap<>();
        int max = 0;

        for(int j = 0, i = 0; j < s.length() ; j++){
            if(myMap.containsKey(s.charAt(j))) {
                i = Math.max(myMap.get(s.charAt(j)), i);
            }

            max = Math.max(max, j - i + 1);
            myMap.put(s.charAt(j), j + 1);

        }

        return max;
    }
}
