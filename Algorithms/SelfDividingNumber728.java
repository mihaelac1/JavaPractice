package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class SelfDividingNumber728 {

    public boolean verifyDivisibility(int number){
        int n = number;
        while(n > 0){
            if(n % 10 == 0){
                return false;
            }
            if(number % (n % 10) != 0){
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> result = new ArrayList<Integer>();

        for(int number = left; number <= right; number++){
            if(verifyDivisibility(number)){
                result.add(number);
            }
        }
        return result;

    }
}
