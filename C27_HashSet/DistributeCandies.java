package JavaPracticeGitHub.C27_HashSet;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {

    public int distributeCandies(int[] candyType) {

        if(candyType == null || candyType.length == 0){
            return 0;
        }

        Set<Integer> mySet = new HashSet<>();
        int i = 0;

        while( i < candyType.length && mySet.size() < candyType.length / 2){
            if(mySet.contains(candyType[i])){
                i++;
            }else{
                mySet.add(candyType[i]);
            }
        }

        return mySet.size();
    }
}
