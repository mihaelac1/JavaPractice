package JavaPracticeGitHub.Algorithms;
import java.util.*;

public class PascalTriangleII119 {
    private static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        if(rowIndex == 0)
            return row;

        for(int rowNum = 1; rowNum <= rowIndex; rowNum++){
            List<Integer> prevRow = new ArrayList<>(row);
            row =  new ArrayList<>();
            row.add(1);
            for(int j = 1; j < rowNum; j++){
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            row.add(1);
        }
        return row;
    }

    public static void main(String[] args) {
        int numRows = 3;
        System.out.println(getRow(numRows).toString());
    }
}
