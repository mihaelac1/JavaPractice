package JavaPracticeGitHub.C27_HashSet;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public int singleNumber(int[] nums) {

        Set<Integer> mySet = new HashSet<>();
        int doubleSum = 0;
        int sum = 0;

        for(int number : nums){
            if(mySet.add(number)){
                doubleSum += number;
            }
            sum += number;
        }

        return(2 * doubleSum) - sum;
    }
}
