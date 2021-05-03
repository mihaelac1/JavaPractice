package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

public class GiveSurpriseAndHug extends AbstractGiveSurprise{

    public GiveSurpriseAndHug(String type, int waitTime){
        super(type, waitTime);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Warm wishes and a big hug!");
    }
}
