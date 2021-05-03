package JavaPracticeGitHub.C30_IO_WorkingWithTextFile.Exercise2;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Excercise2 {

    public static void main(String[] args) throws Exception{

        String firstLineFile1;
        String firstLineFile2;

        try(Scanner scanner = new Scanner(new FileReader("src/Homework/C30_IO/Exercise2/File1.txt"))){
            firstLineFile1 = scanner.nextLine();
        }

        try(Scanner scanner = new Scanner(new FileReader("src/Homework/C30_IO/Exercise2/File2.txt"))){
            firstLineFile2 = scanner.nextLine();
        }

        String[] file1StringArray = firstLineFile1.split(" ");
        System.out.println("array1 -> " + Arrays.toString(file1StringArray));
        String[] file2StringArray = firstLineFile2.split(" ");
        System.out.println("array2 -> " + Arrays.toString(file2StringArray));

        int lengthF1 = file1StringArray.length;
        int lengthF2 = file2StringArray.length;
        int i = 0, j = 0;

        try(BufferedWriter outputFile = new BufferedWriter(new FileWriter("src/Homework/C30_IO/Exercise2/FileSortMerged.txt"))){
            while(i < lengthF1 && j < lengthF2){
                if(Integer.parseInt(file1StringArray[i]) > Integer.parseInt(file2StringArray[j])){
                    outputFile.write(file2StringArray[j] + " ");
                    j++;
                }else{
                    outputFile.write(file1StringArray[i] + " ");
                    i++;
                }
            }

            while(i < lengthF1){
                outputFile.write(file1StringArray[i] + " ");
                i++;
            }
            while(j < lengthF2){
                outputFile.write(file2StringArray[j] + " ");
                j++;
            }
        }

    }
}
