package JavaPracticeGitHub.C30_IO_WorkingWithTextFile.Exercice3;

import java.io.*;
import java.util.*;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        Set<String> mySet = new TreeSet<>();
        String shortWord = "", longWord = "";
        int nbTotalWords = 0, lgthShort = Integer.MAX_VALUE, lgthLong = Integer.MIN_VALUE;

        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("src/Homework/C30_IO/Exercice3/InputFile.txt")))){
            while(scanner.hasNextLine()){
                String word = scanner.nextLine();
                nbTotalWords++;
                mySet.add(word);

                if(lgthLong < word.length()){
                    longWord = word;
                    lgthLong = word.length();

                }

                if(lgthShort > word.length()){
                    shortWord = word;
                    lgthShort = word.length();

                }
            }
        }

        List<String> myArray = new ArrayList<>(mySet);

        try( BufferedWriter bw = new BufferedWriter(new FileWriter("src/Homework/C30_IO/Exercice3/result.txt"))){
            bw.write("The shortest word -> " + shortWord + "\n" +
                    "The longest word -> " + longWord + "\n" +
                    "First word alphabetic order -> " + myArray.get(0)+ "\n"  +
                    "Last word alphabetic order -> " + myArray.get(myArray.size() - 1) + "\n"  +
                    "Total nb of words -> " + nbTotalWords );
        }



    }
}
