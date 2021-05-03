package JavaPracticeGitHub.C22_LinkedList.ex1;

import java.util.Objects;

public class Town implements Comparable<Town>{

    private String name;
    private int nbKilometers;

    public Town(String name, int nbKilometers){
        this.name = name;
        this.nbKilometers = nbKilometers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNbKilometers() {
        return nbKilometers;
    }

    public void setNbKilometers(int nbKilometers) {
        this.nbKilometers = nbKilometers;
    }

    @Override
    public String toString() {
        return name + " " + nbKilometers + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Town town = (Town) o;
        return nbKilometers == town.nbKilometers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nbKilometers);
    }

    @Override
    public int compareTo(Town o) {
       if(this.nbKilometers < o.nbKilometers){
            return -1;
       }else if(this.nbKilometers > o.nbKilometers){
            return 1;
       }else{
           return 0;
       }
    }
}
