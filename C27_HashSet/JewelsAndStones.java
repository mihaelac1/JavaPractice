package JavaPracticeGitHub.C27_HashSet;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {

    public int numJewelsInStonesHashSet(String jewels, String stones) {

        Set<Character> myJewels = new HashSet<>();

        for(Character ch : jewels.toCharArray()){
            myJewels.add(ch);
        }

        int count = 0;

        for(Character ch : stones.toCharArray()){
            if(myJewels.contains(ch)){
                count++;
            }
        }

        return count;
    }

    public int numJewelsInStonesClassic(String jewels, String stones) {
        int nrJewels = 0;

        for(int i = 0; i < stones.length(); i++)
            for(int j = 0; j < jewels.length(); j++)
                if(stones.charAt(i) == jewels.charAt(j))
                    nrJewels++;
        return nrJewels;
    }

}
