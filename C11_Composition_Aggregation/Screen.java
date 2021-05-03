package JavaPracticeGitHub.C11_Composition_Aggregation;

import java.util.*;

public class Screen {
    //Class that creates objects that describe a Screen
    //Fields - Composition
    ArrayList<Pixel> pixels;
    Dimensions dimensions;

    //Constructors
    public Screen(int nbPixels, int width, int length, int depth){
        this.dimensions = new Dimensions(width, length, depth);
        this.pixels = new ArrayList<>();
        for(int i = 0; i < nbPixels; i++){
            this.pixels.add(new Pixel());
        }
    }

    //Functionalities

    // Wrapper method that delegate the action "setPixel" -- change the color of the pixel from position "indexPixel"
    public void setPixel(int indexPixel, String color){
        System.out.println("class Screen: delegate to Pixel to change the color for the index ->" + indexPixel);
        this.pixels.get(indexPixel).setPixel(color);
    }

    // Wrapper method that delegate the action "setPixel" -- change the color of the pixels in the whole ArrayList of pixels
    public void colorScreen(String color){
        System.out.println("class Screen: delegate to Pixel to change the color in  ->" + color);
        for(Pixel p : this.pixels){
            p.setPixel(color);
        }
    }

    //Override for the three important methods inherited from the Object - toString(), equals(obj), hashCode()
    @Override
    public String toString() {
        return "Screen{" +
                "Nb of pixels=" + pixels.size() +
                ", dimensions=" + dimensions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Screen screen = (Screen) o;
        return pixels.size() == screen.pixels.size() && Objects.equals(dimensions, screen.dimensions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pixels.size(), dimensions);
    }
}
