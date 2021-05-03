package JavaPracticeGitHub.C26_HashTable;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInaString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> myMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(myMap.containsKey(currentChar)){
                myMap.put(currentChar, myMap.get(currentChar) + 1);
            }else{
                myMap.put(currentChar, 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            char currentChar = s.charAt(i);
            if(myMap.get(currentChar) == 1){
                return i;
            }
        }

        return -1;
    }
}
