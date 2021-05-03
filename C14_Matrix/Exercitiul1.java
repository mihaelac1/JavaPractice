package JavaPracticeGitHub.C14_Matrix;

import java.util.*;

public class Exercitiul1 {

    private static Scanner inputScanner = new Scanner(System.in);

    public static void printMatrixArrayList(ArrayList<ArrayList<Integer>> numbers){
        for(int i=0; i<numbers.size(); i++) {
            for (int j = 0; j < numbers.get(i).size(); j++) {
                System.out.print(numbers.get(i).get(j) + "\t");
            }
            System.out.println();
        }
    }

    public static void printMatrixArray(int[][] numbers){
        for(int i=0; i<numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Introdu dimensiunea matricei: ");
        int matrixDimension = inputScanner.nextInt();
        int[][] myMatrix = new int[matrixDimension][matrixDimension];
        ArrayList<ArrayList<Integer>> myMatrixArrayList = new ArrayList<ArrayList<Integer>>(matrixDimension);
        for (int i = 0; i < matrixDimension; i++) {
            ArrayList<Integer> newRow = new ArrayList<Integer>(matrixDimension);
            for (int j = 0; j < matrixDimension; j++) {
                newRow.add(0);
            }
            myMatrixArrayList.add(newRow);
        }

        System.out.println("Valoarea elementelor de pe diag principala : ");
        int mainDiagValue = inputScanner.nextInt();
        System.out.println("Valoarea elementelor de pe diag secundara : ");
        int sndDiagValue = inputScanner.nextInt();

        if (matrixDimension % 2 == 1) {
            System.out.println("valoarea elementului de pe pozitia din centru a matricei: ");
             int centerValue = inputScanner.nextInt();
            myMatrix[matrixDimension/2][matrixDimension/2] = centerValue;
            myMatrixArrayList.get(matrixDimension / 2).set(matrixDimension / 2, centerValue);
        }

        System.out.println("valoarea elementelor din stanga: ");
        int leftValue = inputScanner.nextInt();
        System.out.println("valoarea elementelor din partea de sus: ");
        int upValue = inputScanner.nextInt();
        System.out.println("valoarea elementelor din dreapta: ");
        int rightValue = inputScanner.nextInt();
        System.out.println("valoarea elementelor din partea de jos:" );
        int bottomValue = inputScanner.nextInt();

        // generare matrice folosind arrays
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i == j) {
                    myMatrix[i][j] = mainDiagValue;
                } else if (i + j == matrixDimension - 1) {
                    myMatrix[i][j] = sndDiagValue;
                } else if (i > j && i + j < matrixDimension -1) {
                    myMatrix[i][j] = leftValue;
                } else if (i < j && i + j < matrixDimension - 1) {
                    myMatrix[i][j] = upValue;
                } else if (i < j && i + j > matrixDimension - 1) {
                    myMatrix[i][j] = rightValue;
                } else if (i > j && i + j > matrixDimension - 1) {
                    myMatrix[i][j] = bottomValue;
                }
            }
        }

        // generare matrice folosind arrayList
        for (int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                if (i == j) {
                    myMatrixArrayList.get(i).set(j, mainDiagValue);
                } else if (i + j == matrixDimension - 1) {
                    myMatrixArrayList.get(i).set(j, sndDiagValue);
                } else if (i > j && i + j < matrixDimension -1) {
                    myMatrixArrayList.get(i).set(j, leftValue);
                } else if (i < j && i + j < matrixDimension - 1) {
                    myMatrixArrayList.get(i).set(j, upValue);
                } else if (i < j && i + j > matrixDimension - 1) {
                    myMatrixArrayList.get(i).set(j, rightValue);
                } else if (i > j && i + j > matrixDimension - 1) {
                    myMatrixArrayList.get(i).set(j, bottomValue);
                }
            }
        }

        //Print matrix
        printMatrixArrayList(myMatrixArrayList);
        System.out.println();
        printMatrixArray(myMatrix);

        //operation with matrix

        int[][] sumMatrix = new int[matrixDimension][matrixDimension];
        int[][] subtractionMatrix = new int[matrixDimension][matrixDimension];
        int[][] multiplicationMatrix = new int[matrixDimension][matrixDimension];
        int[][] multiplicationMatrixScalar = new int[matrixDimension][matrixDimension];
        int scalar = 5;

        for(int i = 0; i < matrixDimension; i++){
            for(int j = 0; j < matrixDimension; j++){
                sumMatrix[i][j] = myMatrix[i][j] + myMatrix[i][j];
                subtractionMatrix[i][j] = myMatrix[i][j] - myMatrix[i][j];
//                multiplicationMatrix[i][j] = myMatrix[i][j] - myMatrix[i][j];
                multiplicationMatrixScalar[i][j] = myMatrix[i][j] * scalar;
            }
        }

        //Inmultirea a doua matrici
        for(int i = 0; i < matrixDimension; i++) {
            for (int j = 0; j < matrixDimension; j++) {
                for(int k = 0; k < matrixDimension; k++){
                    multiplicationMatrix[i][j] += myMatrix[i][k] * myMatrix[k][j];
                }
            }
        }

        System.out.println("Sum matrix: ");
        printMatrixArray(sumMatrix);
        System.out.println();

        System.out.println("subtractionMatrix: ");
        printMatrixArray(subtractionMatrix);
        System.out.println();

        System.out.println("multiplicationMatrixScalar: ");
        printMatrixArray(multiplicationMatrixScalar);
        System.out.println();

        System.out.println("multiplicationMatrix: ");
        printMatrixArray(multiplicationMatrix);
        System.out.println();
    }
}
