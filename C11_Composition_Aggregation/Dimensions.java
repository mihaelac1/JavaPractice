package JavaPracticeGitHub.C11_Composition_Aggregation;

import java.util.Objects;

public class Dimensions {
    //Class that define the dimensions of a screen, containing the width, length and depth
    //Fields
    private final int width;
    private final int length;
    private final int depth;

    //Constructor
    public Dimensions(int width, int length, int depth){
        this.width = width;
        this.length = length;
        this.depth = depth;
    }

    //Functionalities
    //Getter for accessing directly the width and the length
    public int getWidth() {
        return width;
    }
    public int getLength() {
        return length;
    }

    //Override for the three important methods inherited from the Object - toString(), equals(obj), hashCode()
    @Override
    public String toString() {
        return "Dimensions{" +
                "width=" + width +
                ", length=" + length +
                ", depth=" + depth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dimensions that = (Dimensions) o;
        return width == that.width && length == that.length && depth == that.depth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, length, depth);
    }
}
