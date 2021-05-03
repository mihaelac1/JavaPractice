package JavaPracticeGitHub.P2_AplicatieImparteSurprize;
//used for generate surprises - random

import java.util.*;

public final class GatherSurprises {
    private static Random random = new Random();
    private static ArrayList<ISurprise> arraySurprise = new ArrayList<>();

    private GatherSurprises(){}

    public static ArrayList<ISurprise> gather(int n){
        for(int i = 0; i < n; i++){
            ISurprise surprise = gather();
            while(arraySurprise.contains(surprise)){
               surprise = gather();
            }
            arraySurprise.add(surprise);
        }
    return arraySurprise;
    }

    public static ISurprise gather(){
        int n = random.nextInt(3);
        switch (n){
            case 0 -> {return FortuneCookie.generate();}
            case 1 -> {return Candies.generate();}
            case 2 -> {return MinionToy.generate();}
        }
        return null;
    }

}
