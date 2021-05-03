package JavaPracticeGitHub.C11_Composition_Aggregation;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(3, 10, 12, 3,100, 85, 100, 63);
        Smartphone smartphone2 = new Smartphone(3, 10, 12, 3,100, 85, 100, 63);
        smartphone.pressPowerButton();
        smartphone.pressVolumeUp();
        smartphone.pressVolumeDown();
        smartphone.setSilenceMode();
        smartphone.increaseMicrophoneVolume();
        smartphone.decreaseMicrophoneVolume();
        smartphone.muteMicrophone();
        smartphone.decreaseMicrophoneVolume();
        smartphone.pressVolumeDown();
        smartphone.setPixel(1,"red");
        smartphone.colorScreen("blue");

        System.out.println(smartphone);
        System.out.println();
        System.out.println("smartphone equals smartphone1? " + smartphone.equals(smartphone2));
        System.out.println("hashcode smartphone: " + smartphone.hashCode());
        System.out.println("hashcode smartphone2: " + smartphone2.hashCode());
        System.out.println("change color of the screen ");
        smartphone.colorScreen("red");
        System.out.println("smartphone equals smartphone1? " + smartphone.equals(smartphone2));
        System.out.println("hashcode smartphone: " + smartphone.hashCode());
        System.out.println("hashcode smartphone2: " + smartphone2.hashCode());

    }
}
