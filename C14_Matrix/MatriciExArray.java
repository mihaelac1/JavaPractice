package JavaPracticeGitHub.C14_Matrix;

import java.util.ArrayList;
import java.util.Scanner;

public class MatriciExArray {
    private static int matrixDimensions;
    private static Scanner inputScanner = new Scanner(System.in);

    public static int[][] myMatrixArray(){
        System.out.println("\t Folosind arrays");
        System.out.println("Introduceti dimensiunea maxima a matricei: ");
        matrixDimensions = inputScanner.nextInt();
        int[][] arrayMatrix = new int[matrixDimensions][matrixDimensions];
        System.out.println("Introduceti valorile matricei: ");
        for(int i = 0; i < matrixDimensions; i++){
            for(int j = 0; j < matrixDimensions; j++){
                System.out.print("matrix[" + i + "][" + j + "] = ");
                arrayMatrix[i][j] = inputScanner.nextInt();
            }
        }
        return arrayMatrix;
    }

    public static ArrayList<ArrayList<Integer>> myMatrixArrayList(){
        System.out.println("\t Folosind arrayList");
        System.out.println("Introduceti dimensiunea maxima a matricei: ");
        matrixDimensions = inputScanner.nextInt();
        ArrayList<ArrayList<Integer>> arrayListMatrix;
        arrayListMatrix = new ArrayList<ArrayList<Integer>>(matrixDimensions);
        System.out.println("Introduceti valorile matricei: ");
        for(int i = 0; i < matrixDimensions; i++){
            ArrayList<Integer> newRow = new ArrayList<Integer>(matrixDimensions);
            for(int j = 0; j < matrixDimensions; j++){
                System.out.print("matrix[" + i + "][" + j + "] = ");
                newRow.add(inputScanner.nextInt());
            }
            arrayListMatrix.add(newRow);
        }
        return arrayListMatrix;
    }

    public static void main(String[] args) {
        int[][] numbers;
        numbers = new int[5][5];
//        numbers[2][1] = 101;  // Number is on line 2, column 1.
//        // Note: numbering starts at 0 (as always).
//        // Look for number 101 in the image!
//        numbers[0][0] = 2;  // first position in matrix
//        numbers[4][5] = 91; // last position in matrix
//        numbers[3][3] = 88;
//        numbers[2][5] = 55;
//        numbers[3][0] = 923;
//        System.out.println(numbers[2][5]);
//        System.out.println(numbers[2][4]);
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = j;
                System.out.println("Element on line " + i +
                        " and column " + j + " is " + numbers[i][j]);
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }
        int sumElemDiagPrincipala = 0;
        int sumElemDiagSecundara = 0;
        int sumElemDeasupraDiagPrincipala = 0;
        int sumElemSubDiagPrincipala = 0;
        int sumElemDeasupraDiagSecundare = 0;
        int sumElemSubDiagSecundare = 0;
        int length = numbers.length;
        if (length % 2 == 1) {
            System.out.println("Elementul central este: " + numbers[length/2][length/2]);
        } else {
            System.out.println("Lungimea matricei este egala, nu exista elementul central.");
        }
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j) {
                    sumElemDiagPrincipala += numbers[i][j];
                } else if (i + j == length - 1) {
                    sumElemDiagSecundara += numbers[i][j];
                } else if (i < j) {
                    sumElemDeasupraDiagPrincipala += numbers[i][j];
                } else if (i > j) {
                    sumElemSubDiagPrincipala += numbers[i][j];
                } else if (i + j < length - 1) {
                    sumElemDeasupraDiagSecundare += numbers[i][j];
                } else if (i + j > length - 1) {
                    sumElemSubDiagSecundare += numbers[i][j];
                }
            }
        }
        System.out.println("Suma elementelor de pe diag principala: " + sumElemDiagPrincipala);
        System.out.println("Suma elementelor de pe diag secundara: " + sumElemDiagSecundara);
        System.out.println("Suma elementelor de deasupra diag principala: " + sumElemDeasupraDiagPrincipala);
        System.out.println("Suma elementelor de sub diag principala: " + sumElemSubDiagPrincipala);
        System.out.println("Suma elementelor de deasupra diag secundare: " + sumElemSubDiagPrincipala);
        System.out.println("Suma elementelor de sub diag secundara: " + sumElemSubDiagPrincipala);

    }
}
