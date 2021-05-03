package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

public class LIFOBag extends AbstractBag{

    @Override
    public ISurprise takeOut() {
        return super.getBag().remove(super.bag.size() - 1);
//        return super.bag.remove(super.bag.size() - 1);
    }

    @Override
    public String toString() {
        return "LIFOBag{" +
                "bag=" + bag +
                '}';
    }
}
