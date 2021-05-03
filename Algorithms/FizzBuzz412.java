package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class FizzBuzz412 {
    public static List<String> fizzBuzz(int n) {
        List<String> fizz = new ArrayList<String>();

        for(int i = 0; i < n; i++){
            int currentIdx = i + 1;
            if(currentIdx % 3 == 0 && currentIdx % 5 == 0){
                fizz.add(i,"FizzBuzz");
            }else if(currentIdx % 3 == 0){
                fizz.add(i, "Fizz");
            }else if(currentIdx % 5 == 0){
                fizz.add(i, "Buzz");
            }
            else{
                fizz.add(i , String.valueOf(currentIdx));
            }
        }
        return fizz;
    }

    public static void main(String[] args) {
        int n = 1;
        System.out.println(fizzBuzz(n));
    }
}
