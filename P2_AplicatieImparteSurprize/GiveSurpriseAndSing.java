package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

public class GiveSurpriseAndSing extends AbstractGiveSurprise{

    public GiveSurpriseAndSing(String type, int waitTime){
        super(type, waitTime);
    }

    @Override
    void giveWithPassion() {
        System.out.println("Singing a nice song, full of joy and genuine excitement…");
    }
}
