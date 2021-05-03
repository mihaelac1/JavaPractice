package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

import java.util.*;

public class RandomBag extends AbstractBag{
    private Random random = new Random();

    @Override
    public ISurprise takeOut() {
        int n = random.nextInt(super.bag.size());
        return super.getBag().remove(n);
//        return super.bag.remove(n);
    }

    @Override
    public String toString() {
        return "RandomBag{" +
                "bag=" + bag +
                '}';
    }
}
