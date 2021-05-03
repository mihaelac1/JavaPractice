package JavaPracticeGitHub.C16_NestedClasses_LeetCode;
import java.util.*;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        ArrayList<String> myArrayList = new ArrayList<>();
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";

        for(int i = 0; i < words.length; i++){
            String currentWord = words[i].toLowerCase();
            int first = 0;
            int second = 0;
            int third = 0;

            for(int j = 0; j < currentWord.length(); j++){
                String currentChar = String.valueOf(currentWord.charAt(j));
                if(firstRow.indexOf(currentChar) >= 0){
                    first++;
                }
                if(secondRow.indexOf(currentChar) >= 0){
                    second++;
                }
                if(thirdRow.indexOf(currentChar) >= 0){
                    third++;
                }
                if((first != 0 && (second != 0 || third != 0)) || (second != 0 && (first != 0 || third != 0))
                        || (third != 0 && (second != 0 || first != 0))){
                    break;
                }
            }
            if(first == currentWord.length() || second == currentWord.length() || third == currentWord.length()){
                myArrayList.add(words[i]);
            }

        }
        return myArrayList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));
    }
}