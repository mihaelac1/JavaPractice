package JavaPracticeGitHub.C11_Composition_Aggregation;

import java.util.Objects;

public class Smartphone {
    //Fields - using Composition
    private Screen theScreen;
    private Case theCase;
    private Speaker theSpeaker;
    private Microphone theMicrophone;

    //Constructors
    public Smartphone(Screen theScreen, Case theCase,
                      Speaker theSpeaker, Microphone theMicrophone) {
        this.theScreen = theScreen;
        this.theCase = theCase;
        this.theSpeaker = theSpeaker;
        this.theMicrophone = theMicrophone;
    }

    public Smartphone(int nbPixels, int width, int length, int depth, int maxVolumeSpeaker, int maxVolumeMicro ){
        this.theScreen = new Screen(nbPixels, width, length, depth);
        this.theSpeaker = new Speaker(maxVolumeSpeaker);
        this.theMicrophone  = new Microphone(maxVolumeMicro);
        this.theCase = new Case();
    }
    public Smartphone(int nbPixels, int width, int length, int depth, int maxVolumeSpeaker, int crtVolumeSpeaker, int maxVolumeMicro , int crtVolumeMicro){
        this.theScreen = new Screen(nbPixels, width, length, depth);
        this.theSpeaker = new Speaker(maxVolumeSpeaker, crtVolumeSpeaker);
        this.theMicrophone  = new Microphone(maxVolumeMicro, crtVolumeMicro);
        this.theCase = new Case();
    }

    //Functionalities
    //delegate the responsibility to the object specific method, Obs: reusing the object functionality
    public void pressPowerButton() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressPowerButton();
        System.out.println();
    }

    //methods for audio changes
    public void pressVolumeUp() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeUp();
        System.out.println("class Smartphone: delegate to Speaker ->");
        this.theSpeaker.increaseVolume();
        System.out.println();
    }
    public void pressVolumeDown() {
        System.out.println("class Smartphone: delegate to Case ->");
        this.theCase.pressVolumeDown();
        System.out.println("class Smartphone: delegate to Speaker ->");
        this.theSpeaker.decreaseVolume();
        System.out.println();
    }
    public void increaseMicrophoneVolume(){
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.increaseVolume();
        System.out.println();
    }
    public void decreaseMicrophoneVolume(){
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.decreaseVolume();
        System.out.println();
    }
    public void muteMicrophone(){
        System.out.println("class Smartphone: delegate to Microphone ->");
        this.theMicrophone.muteMicrophone();
        System.out.println();
    }
    public void setSilenceMode(){
        System.out.println("class Smartphone: delegate to Speaker ->");
        this.theSpeaker.setSilenceMode();
        System.out.println();
    }

    //methods for color of the screen changes
    public void setPixel(int idxPixel, String color){
        System.out.println("class Smartphone: delegate to Screen ->");
        this.theScreen.setPixel(idxPixel, color);
        System.out.println();
    }
    public void colorScreen(String color){
        System.out.println("class Smartphone: delegate to Screen ->");
        this.theScreen.colorScreen(color);
        System.out.println();
    }

    //Override for the three important methods inherited from the Object - toString(), equals(obj), hashCode()
    @Override
    public String toString() {
        return "Smartphone{" +
                "theScreen=" + theScreen +
                ", theSpeaker=" + theSpeaker +
                ", theMicrophone=" + theMicrophone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Smartphone that = (Smartphone) o;
        return Objects.equals(theScreen, that.theScreen) && Objects.equals(theSpeaker, that.theSpeaker) && Objects.equals(theMicrophone, that.theMicrophone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theScreen, theSpeaker, theMicrophone);
    }
}
