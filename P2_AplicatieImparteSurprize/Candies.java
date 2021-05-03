package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

import java.util.*;

public class Candies implements ISurprise {

    private int nbCandies;
    private String candie;
    private static ArrayList<String> arrayTypeOfCandies = new ArrayList<>(Arrays.asList("chocolate", "jelly", "fruits", "vanilla"));

    private Candies(int nbCandies, String candie){
        this.nbCandies = nbCandies;
        this.candie = candie;
    }

    public static Candies generate() {
        int n = random.nextInt(10) + 1;
        int m = random.nextInt(arrayTypeOfCandies.size());
        return new Candies(n, arrayTypeOfCandies.get(m));
    }

    @Override
    public void enjoy() {
        System.out.print("Congratulations! You have received: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return nbCandies + " " + candie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candies candies = (Candies) o;
        return Objects.equals(candie, candies.candie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(candie);
    }
}
