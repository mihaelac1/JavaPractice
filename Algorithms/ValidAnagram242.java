package JavaPracticeGitHub.Algorithms;

import java.util.ArrayList;

public class ValidAnagram242 {

    public boolean isAnagramExceedTimeLimit(String s, String t) {
        if(t.length() != s.length()){
            return false;
        }
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = 0; i < t.length(); i++){
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(j) == t.charAt(i) && !myList.contains(j)){
                    myList.add(j);
                    break;
                }
            }
        }
        if(myList.size() == s.length()){
            return true;
        }
        return false;

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

