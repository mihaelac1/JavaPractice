package JavaPracticeGitHub.C30_IO_WorkingWithTextFile.Exercise1;

import java.io.*;
import java.util.Scanner;

public class Exercise1_1 {

    public static void main(String[] args) throws IOException {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Input the first word: ");
        String firstWord = inputScanner.nextLine();
        System.out.println("Input the second word: ");
        String secondWord = inputScanner.nextLine();
        inputScanner.close();

//        String firstWord ="fotbal";
//        String secondWord ="volei";

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/Homework/C30_IO/Exercise1/TextInput.txt")))){
            try(BufferedWriter outputFile = new BufferedWriter(new FileWriter("src/Homework/C30_IO/Exercise1/TextOutput.txt"))){
                while(scanner.hasNextLine()){
                    outputFile.write(scanner.nextLine().replaceAll(firstWord, secondWord));
                    outputFile.write("\n");
                }
            }

        }



    }
}
