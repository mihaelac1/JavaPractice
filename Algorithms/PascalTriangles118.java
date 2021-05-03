package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class PascalTriangles118 {
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> myList= new ArrayList<>();
        if(numRows == 0){
            return myList;
        }
        List<Integer> listToAdd = new ArrayList<>();

        listToAdd.add(1);
        myList.add(listToAdd);
        if(numRows == 1){
            return myList;
        }
        listToAdd = new ArrayList<>();
        listToAdd.add(1);
        listToAdd.add(1);
        myList.add(listToAdd);
        if(numRows == 2){
            return myList;
        }
        for(int i = 2; i < numRows; i++){
            listToAdd = new ArrayList<>();
            List<Integer> prevList = new ArrayList<Integer>();
            prevList.addAll(myList.get(i - 1));
            listToAdd.add(1);
            for(int j = 0; j < prevList.size() - 1; j++){
                listToAdd.add(prevList.get(j) + prevList.get(j + 1));
            }
            listToAdd.add(1);
            myList.add(listToAdd);
        }

    return myList;

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(generate(n));
    }
}
