package JavaPracticeGitHub.C14_Matrix;

public class GeneratePrimeNumbers {
    public static void main(String[] args) {
        int n = 120;
        boolean[] myArrayEratostene = new boolean[n + 1 ];
        for(int  i = 2; i * i <= n ; i++){
            if(!myArrayEratostene[i]){
                for(int j = i; j * i <= n; j++){
                    myArrayEratostene[j * i] = true;
                }
            }
        }
        int numbersPrimes = 0;
        for(int i = 2; i <= n; i++){
            if(!myArrayEratostene[i]){
                numbersPrimes++;
            }
        }
        System.out.println("Numar numere prime < n: " + numbersPrimes);

    }
}
