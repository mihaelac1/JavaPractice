package JavaPracticeGitHub.C26_HashTable;

import java.util.HashMap;

public class ValidAnagram {

    public boolean isAnagramHashMap(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> myMap = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            if(myMap.containsKey(s.charAt(i))){
                myMap.put(s.charAt(i), myMap.get(s.charAt(i)) + 1);
            }else{
                myMap.put(s.charAt(i), 1);
            }

        }

        for(int i = 0; i < t.length(); i++){
            if(myMap.containsKey((t.charAt(i)))){
                myMap.put(t.charAt(i), myMap.get(t.charAt(i)) -1);

                if(myMap.get(t.charAt(i)) < 0){
                    return false;
                }

            }else{
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] counter = new int[26];
        for(int i = 0; i < s.length(); i++){
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int count:counter){
            if(count != 0){
                return false;
            }
        }
        return true;
    }
}
