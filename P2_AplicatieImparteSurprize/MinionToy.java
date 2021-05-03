package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

import java.util.*;

public class MinionToy implements ISurprise {

    private String minionName;
    private static ArrayList<String> minionsNames = new ArrayList<>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
    private static int orderMinion = 0;

    private MinionToy(String minionName){
        orderMinion++;
        this.minionName = minionName;
    }

    public static MinionToy generate() {
//        return new MinionToy(minionsNames.get(orderMinion % minionsNames.size()));
        if(orderMinion > minionsNames.size() - 1){
            orderMinion = 0;
        }
        return new MinionToy(minionsNames.get(orderMinion));
    }

    @Override
    public void enjoy() {
        System.out.print("Congratulations! You received a Minion.");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "The minion: " + minionName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MinionToy minionToy = (MinionToy) o;
        return Objects.equals(minionName, minionToy.minionName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(minionName);
    }
}
