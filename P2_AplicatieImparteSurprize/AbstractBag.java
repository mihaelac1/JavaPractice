package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

import java.util.ArrayList;
import java.util.Objects;

abstract class AbstractBag implements IBag {

    public ArrayList<ISurprise> bag = new ArrayList<>();

    @Override
    public void put(ISurprise iSurprise) {
        this.bag.add(iSurprise);
    }

    @Override
    public void put(ArrayList<ISurprise> iSurprises){
            this.bag.addAll(iSurprises);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(!bagOfSurprises.isEmpty()){
            put(bagOfSurprises.takeOut());
        }
    }

    public ArrayList<ISurprise> getBag() {
        return bag;
    }

    @Override
    public int size() {
        return this.bag.size();
    }

    @Override
    public boolean isEmpty() {
       return size() == 0;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractBag that = (AbstractBag) o;
        return Objects.equals(bag, that.bag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bag);
    }
}
