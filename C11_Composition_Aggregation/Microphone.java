package JavaPracticeGitHub.C11_Composition_Aggregation;

import java.util.Objects;

public class Microphone {
    //Class that describe a Microphone
    //Fields
    private int maxVolume; // max volume of the microphone
    private int crtVolume; // current volume ot the microphone

    //Constructors
    public Microphone(int maxVolume){
        this.maxVolume = maxVolume;
        this.crtVolume = (int) 0.4 * maxVolume;
    }
    public Microphone(int maxVolume, int crtVolume){
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    //Functionalities
    //method that increase the micro volume by one unit, after checking that it does not exceed the maximum volume
    public boolean increaseVolume(){
        if(this.crtVolume + 1 <= this.maxVolume){
            System.out.println("Class Microphone: Before increase the  micro volume: " + this.crtVolume);
            this.crtVolume += 1;
            System.out.println("Class Microphone: After increase micro volume: " + this.crtVolume);
            return true;
        }
        System.out.println("Class Microphone: Current volume is at maximum: " + this.crtVolume);
        return false;
    }
    //method that decrease the micro volume by one unit, after checking that it is not below the minimum value = 0
    public boolean decreaseVolume(){
        System.out.println("Class Microphone: Decrease micro volume, current voulume: " + this.crtVolume);
        if(this.crtVolume - 1 >= 0){
            this.crtVolume -= 1;
            System.out.println("Class Microphone: After decrease micro volume, , current voulume: " + this.crtVolume);
            return true;
        }
        System.out.println("Class Microphone: Current volume is at minimum: " + this.crtVolume);
        return false;
    }
    //method that mute the micro, the current volume is set to 0
    public void muteMicrophone(){
        System.out.println("Class Microphone: The microphone is on silence mode.");
        this.crtVolume = 0;
        System.out.println();
    }

    //getters - for the current volume and the max volume
    public int getCrtVolume() {
        return crtVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    //Override for the three important methods inherited from the Object - toString(), equals(obj), hashCode()
    @Override
    public String toString() {
        return "Microphone{" +
                "maxVolume=" + maxVolume +
                ", crtVolume=" + crtVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Microphone that = (Microphone) o;
        return maxVolume == that.maxVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxVolume);
    }
}
