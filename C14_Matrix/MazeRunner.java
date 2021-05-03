package JavaPracticeGitHub.C14_Matrix;

public class MazeRunner {

    private static int[] dirX = {-1, -1, 0, +1, +1, +1, 0, -1};
    private static int[] dirY = {0, +1, +1, +1, 0, -1, -1, -1};

    public static void main(String[] args) {
        int[][] heights = {{8, 5, 7, 5}, {9, 1, 4, 8}, {4, 0, 7, 2}, {7, 9, 3, 6} };

        int elementI = 0, elementJ = 0;
        boolean hasChange;
        do {
            hasChange = false;

            for (int i=0; i<dirX.length; i++) {
                int neighI = elementI + dirX[i];
                int neighJ = elementJ + dirY[i];
                if (neighI >= 0 && neighI < heights.length &&
                        neighJ >= 0 && neighJ < heights[neighI].length &&
                        heights[neighI][neighJ] < heights[elementI][elementJ]) {
                    elementI = neighI;
                    elementJ = neighJ;
                    hasChange = true;
                    break;
                }
            }
        } while(hasChange);

        System.out.println(heights[elementI][elementJ]);
    }

}
