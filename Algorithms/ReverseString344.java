package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        char aux;
        for(int i = 0; i < s.length/2; i++){
            aux = s[i];
            s[i] = s[s.length - 1 - i];
            s[s.length - 1 - i] = aux;
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
        reverseString(new char[]{'H','a','n','n','a','h'});

    }
}
