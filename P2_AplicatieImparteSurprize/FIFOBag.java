package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

public class FIFOBag extends AbstractBag{

    @Override
    public ISurprise takeOut() {
        return super.getBag().remove(0);
//        return super.bag.remove(0);
    }

    @Override
    public String toString() {
        return "FIFOBag{" +
                "bag=" + bag +
                '}';
    }

}
