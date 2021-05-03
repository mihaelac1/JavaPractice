package JavaPracticeGitHub.Algorithms;

import java.util.*;

public class FirstUniqueChString387 {
//for V1 when th string is very big, time limit Exceeded
    public static int firstUniqCharV1(String s) {
        if(s.length() == 1){
            return 0;
        }
        s = s.toLowerCase();
        for(int i = 0; i < s.length(); i++){
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqCharV2(String s){
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        for(int i = 0; i < n; i++){
            char c = s.charAt(i);
            count.put(c,count.getOrDefault(c, 0) + 1);
        }
        for(int i = 0; i < n; i++){
            if(count.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }
    public static int firstUniqCharV3(String s) {
        int j = 0;
        char[] ch = s.toCharArray();
        int count[] = new int[26];
        for (int i = 0; i < ch.length; i++)
            count[ch[i] - 'a']++;
        while (j < ch.length) {
            if (count[ch[j] - 'a'] == 1) {
                return j;
            }
            j++;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(firstUniqCharV1("aadadaad"));
        System.out.println(firstUniqCharV3("leetcode"));
    }
}
