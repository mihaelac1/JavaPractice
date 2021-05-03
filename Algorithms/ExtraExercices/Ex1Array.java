package JavaPracticeGitHub.Algorithms.ExtraExercices;
import java.util.*;

public class Ex1Array {

    private static final Scanner inputScanner = new Scanner(System.in);

    private static int[] readFromInput(){
        System.out.println("Please insert the number of elements of the array (and press enter): ");
        int n = inputScanner.nextInt();
        int[] array = new int[n];
        System.out.println("Please insert the " + n + " elements of the array (and press enter after each element): ");
        for(int i = 0; i < n; i++){
            array[i] = inputScanner.nextInt();
        }

        return array;
    }

    private static int[] newArray(int[] array){
        if(array == null || array.length == 0){
            return array;
        }
        int[] newArray = new int[array.length];
        for(int i = 0; i < newArray.length; i++){
            newArray[i] = array[i] % 10;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = readFromInput();
        System.out.println(Arrays.toString(newArray(array)));

    }
}
