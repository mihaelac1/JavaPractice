package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

import java.io.*;
import java.util.*;

public class FortuneCookie implements ISurprise {

    private static File file = new File("./src/Homework/P2_AplicatieImparteSurprize/CitateViitor.txt");
    private static Scanner inputScanner;
    String message;

    static {
        try {
            inputScanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<String> quotes = new ArrayList<>();

    private static void addQuotes() {
        while (inputScanner.hasNextLine()) {
            quotes.add(inputScanner.nextLine());
        }
    }

    private FortuneCookie(String message) {
        this.message = message;
    }

    public static FortuneCookie generate() {
        addQuotes();
        int n = random.nextInt(quotes.size());
        return new FortuneCookie(quotes.get(n));
    }

    @Override
    public void enjoy() {
        System.out.print("FortuneCookie surprise! This is your quote for today! \n");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return message ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FortuneCookie that = (FortuneCookie) o;
        return Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message);
    }
}
