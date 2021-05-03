package JavaPracticeGitHub.C27_HashSet;

import java.util.*;

public class KeyboardRow {
    public String[] findWords(String[] words) {

        Set<Character> firstRow = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r',
                't','y','u','i','o','p'));

        Set<Character> secondRow = new HashSet<>(Arrays.asList('a', 's', 'd', 'f',
                'g','h','j','k','l'));

        Set<Character> thirdRow = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v',
                'b','n','m'));

        List<String> myArrayList = new ArrayList<>();


        for(String word : words){

            int count1 = 0, count2 = 0, count3 = 0;

            String currentWord = word.toLowerCase();

            for(Character ch : currentWord.toCharArray()){
                if(firstRow.contains(ch)){
                    count1++;
                }

                if(secondRow.contains(ch)){
                    count2++;
                }

                if(thirdRow.contains(ch)){
                    count3++;
                }

                if((count1 != 0 && (count3 != 0 || count3 != 0)) || (count2 != 0 && (count1 != 0 ||                        count3 != 0))
                        || (count3 != 0 && (count2 != 0 || count1 != 0))){
                    break;
                }
            }

            if(count1 == currentWord.length() || count2 == currentWord.length() || count3 ==                               currentWord.length()){
                myArrayList.add(word);
            }

        }

        return myArrayList.toArray(new String[0]);

    }
}

