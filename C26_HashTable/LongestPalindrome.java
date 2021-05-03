package JavaPracticeGitHub.C26_HashTable;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }

        Map<Character, Integer> myMap = new LinkedHashMap<>();

        for(char c : s.toCharArray()){
            myMap.put(c, myMap.getOrDefault(c,0) + 1);
        }

        int result = 0;

        for(Map.Entry mapElement : myMap.entrySet()){
            result += (int)mapElement.getValue() / 2*2;

            if(result % 2 == 0 && (int)mapElement.getValue() % 2 == 1){
                result++;
            }
        }

        return result;
    }
}
