package JavaPracticeGitHub.C11_Composition_Aggregation;
import java.util.Objects;

public class Pixel {
    //Class that creates objects which contains info about the pixels of a screen
    //Fields
    String color;

    //Constructor
    public Pixel(){
        this.color = "#FFFFFF";
    }
    public Pixel(String color){
        this.color = color;
    }

    //Functionalities
    //setter for the field "color"
    public void setPixel(String color){
       // System.out.println("class Pixel: color changed ->" + color);
        this.color = color;
    }

    //Override for the three important methods inherited from the Object - toString(), equals(obj), hashCode()
    @Override
    public String toString() {
        return "Pixel{" +
                "color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pixel pixel = (Pixel) o;
        return Objects.equals(color, pixel.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
