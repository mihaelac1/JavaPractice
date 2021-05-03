package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

import java.util.*;

public class Factory implements IBagFactory {

    private final List <IBag> bags = new ArrayList<>();
    public Factory(){

    }

    @Override
    public IBag makeBag(String type) {
        if(type.equals("RANDOM")){
            return new RandomBag();
        }else if(type.equals("FIFO")){
            return new FIFOBag();
        }else if(type.equals("LIFO")){
            return new LIFOBag();
        }
        return null;
    }
}
