package JavaPracticeGitHub.Algorithms;

public class CountPrimes {
    public boolean isPrime(int number){
        if(number == 2){
            return true;
        }
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
    public int countPrimes(int n) {
        int count  = 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }
}
