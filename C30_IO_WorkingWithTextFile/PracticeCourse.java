package JavaPracticeGitHub.C30_IO_WorkingWithTextFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PracticeCourse {

    private static String[] getData() {
        String[] cities =  {"London", "Bucharest", "Berlin", "Moscow"};
        return cities;
    }


    public static void main(String[] args) throws IOException {
        String[] dataToWrite = getData();

        FileWriter outputFile = null;
        try {
            // I. open the file (for writing)
            // Note: if the file does not exist, it is created automatically
            outputFile = new FileWriter("output.txt", true);

            // II. Write the data to file
            for (String city : dataToWrite) {
                outputFile.write("\n" + city);
            }
        } catch (IOException e) {
            System.out.println("Something wrong has happened...");
            e.printStackTrace();
        } finally {
            //III. Close the file afterwards
            try {
                if (outputFile != null) {
                    outputFile.close();
                }
            } catch (IOException e) {
                System.out.println("Exception raised when attempting to close the file");
                e.printStackTrace();
            }
        }

        String lastLine = "";

        try(Scanner scanner = new Scanner(new FileReader("output.txt"))) {
            while(scanner.hasNextLine()) {
                lastLine = scanner.nextLine();
                // use the next line in program
            }
        }
        System.out.println("read lastLine -> " + lastLine);
//        FileWriter outputFile2 = null;

        try(FileWriter outputFile2 = new FileWriter("output2.txt")) {
            for (String city : dataToWrite) {
                outputFile2.write(city + " ");
            }
        }

        String lastLineBr = "";

        FileReader newFileReader = new FileReader("output.txt");
        BufferedReader br = new BufferedReader(newFileReader);
        try(Scanner scanner = new Scanner(br)){
            while(scanner.hasNextLine()) {
                lastLineBr = scanner.nextLine();
            }
        }

        System.out.println("read lastLine br -> " + lastLineBr);



    }
}
