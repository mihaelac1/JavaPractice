package JavaPracticeGitHub.C3_Strings;

import java.util.*;

public class AnagramsSolver {

    private static int nbAparitii(String s, char ch){
        int count = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    private static boolean anagramSolverV1(String anag1, String anag2){
        int n = anag1.length();
        int m = anag2.length();
        anag1 = anag1.toLowerCase();
        anag2 = anag2.toLowerCase();
        for(int i = 0; i < n; i++){
            if(!Character.isLetter(anag1.charAt(i))){
                continue;
            }
            int nbOcc1 = nbAparitii(anag1, anag1.charAt(i));
            int nbOcc2 = 0;
            for(int j = 0; j < m; j++){
                if(anag1.charAt(i) == anag2.charAt(j)){
                    nbOcc2++;
                }
            }
            if(nbOcc1 != nbOcc2){
                return false;
            }
        }
        return true;
    }

    private static boolean anagramSolver(String anag1, String anag2){
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i = 0; i < anag1.length(); i++){
            if(Character.isLetter(anag1.charAt(i))) {
                str1.append(anag1.toLowerCase().charAt(i));
            }
        }
        for(int i = 0; i < anag2.length(); i++){
            if(Character.isLetter(anag2.charAt(i))) {
                str2.append(anag2.toLowerCase().charAt(i));
            }
        }
        char[] array1 = str1.toString().toCharArray();
        char[] array2 = str2.toString().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(Arrays.equals(array1,array2))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        System.out.println(anagramSolver("William Shakespeare", "I am a weakish speller"));
    }
}
