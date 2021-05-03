package JavaPracticeGitHub.C11_Composition_Aggregation;

import java.util.Objects;

public class Speaker {
    //Class that describe a Speaker
    //Fields
    private int maxVolume; // max volume of the speaker
    private int crtVolume; // current volume ot the speaker

    //Constructors
    public Speaker(int maxVolume){
        this.maxVolume = maxVolume;
        this.crtVolume = (int) 0.4 * maxVolume;
    }
    public Speaker(int maxVolume, int crtVolume){
        this.maxVolume = maxVolume;
        this.crtVolume = crtVolume;
    }

    //Functionalities
    //method that increase the speaker volume by one unit, after checking that it does not exceed the maximum volume
    public boolean increaseVolume(){
        if(this.crtVolume + 1 <= this.maxVolume){
            System.out.println("Class Speaker: Before increase the speaker volume, current volume: " + this.crtVolume);
            this.crtVolume += 1;
            System.out.println("Class Speaker: After increase the speaker volume, current volume: " + this.crtVolume);
            return true;
        }
        System.out.println("Class Speaker: Current volume is at maximum: " + this.crtVolume);
        return false;
    }
    //method that decrease the speaker volume by one unit, after checking that it is not below the minimum value = 0
    public boolean decreaseVolume(){
        if(this.crtVolume - 1 >= 0){
            System.out.println("Class Speaker: Before decrease the speaker volume, current volume: " + this.crtVolume);
            this.crtVolume -= 1;
            System.out.println("Class Speaker: After decrease the speaker volume, current volume: " + this.crtVolume);
            return true;
        }
        System.out.println("Class Speaker: Current volume is at minimum: " + this.crtVolume);
        return false;
    }
    //method that mute the speaker, the current volume is set to 0
    public void setSilenceMode(){
        System.out.println("Class Speaker: The speaker is on silence mode.");
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
        return "Speaker{" +
                "maxVolume=" + maxVolume +
                ", crtVolume=" + crtVolume +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speaker speaker = (Speaker) o;
        return maxVolume == speaker.maxVolume;
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxVolume);
    }
}
