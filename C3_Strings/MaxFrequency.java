package JavaPracticeGitHub.C3_Strings;

import java.util.*;


public class MaxFrequency {

    private static int nbAparitii(String s, char ch){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    private static int maxAparitii(String s){
        int max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch) && Character.isAlphabetic(ch) && nbAparitii(s, ch) > max){
                max = nbAparitii(s, ch);
            }
            set.add(ch);
        }
        return max;
    }

    private static int minAparitii(String s){
        int min = Integer.MAX_VALUE;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!set.contains(ch) && Character.isAlphabetic(ch) && nbAparitii(s, ch) < min){
                min = nbAparitii(s, ch);
            }
            set.add(ch);
        }
        return min;
    }

    private static void maxFrequency(String str) {
        str = str.toLowerCase();
        int max = maxAparitii(str);
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!set.contains(ch) && nbAparitii(str, ch) == max){
                System.out.println("Character '" + str.charAt(i) + "' appears " + max + " times.");
            }
            set.add(ch);
        }
    }

    private static void minFrequency(String str) {
        str = str.toLowerCase();
        int min = minAparitii(str);
        Set<Character> set = new HashSet<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(!set.contains(ch) && nbAparitii(str, ch) == min){
                System.out.println("Character '" + str.charAt(i) + "' appears " + min + " times.");
            }
            set.add(ch);
        }
    }

    public static void main(String[] args) {
        String argument = "Becoming a programmer is like gaining super powers!";
        long start = System.nanoTime();
        maxFrequency(argument);
        long end = System.nanoTime();
        System.out.println("Time elapsed: " + (end - start) / 100_000_000d);
        minFrequency(argument);
    }
}
