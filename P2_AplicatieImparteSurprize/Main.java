package JavaPracticeGitHub.P2_AplicatieImparteSurprize;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Factory factoryBag = new Factory();
        IBag bag1 = factoryBag.makeBag("FIFO");
//        bag1.put(GatherSurprises.gather());
//        bag1.put(GatherSurprises.gather());
//        bag1.put(GatherSurprises.gather());
//        System.out.println("bag1 size = " + bag1.size());
//        System.out.println("bag1 empty = " + bag1.isEmpty());
//        System.out.println(bag1);
//        System.out.println(bag1.takeOut());
//        System.out.println(bag1);
//        System.out.println("bag1 size = " + bag1.size());
//        System.out.println();

//        IBag bag2 = factoryBag.makeBag("LIFO");
//        bag2.put(GatherSurprises.gather());
//        bag2.put(GatherSurprises.gather());
//        bag2.put(GatherSurprises.gather());
//        System.out.println("bag2 size = " +bag2.size());
//        System.out.println("bag2 empty = " + bag2.isEmpty());
//        System.out.println(bag2);
//        System.out.println(bag2.takeOut());
//        System.out.println(bag2);
//        System.out.println();
//
//        IBag bag3 = factoryBag.makeBag("RANDOM");
//        bag3.put(GatherSurprises.gather());
//        bag3.put(GatherSurprises.gather());
//        bag3.put(GatherSurprises.gather());
//        System.out.println("bag3 size = " +bag3.size());
//        System.out.println("bag3 empty = " + bag3.isEmpty());
//        System.out.println(bag3);
//        System.out.println(bag3.takeOut());
//        System.out.println(bag3);
//        System.out.println();
//
//        bag1.put(bag2);
//        System.out.println("bag1 size = " + bag1.size());
//        System.out.println("bag1 empty = " + bag1.isEmpty());
//        System.out.println(bag1);

        GiveSurpriseAndHug giveSurpriseAndHug = new GiveSurpriseAndHug("RANDOM", 3);
        ArrayList<ISurprise> iSurprisesArray = GatherSurprises.gather(3);
        IBag bag = factoryBag.makeBag("RANDOM");
        bag.put(iSurprisesArray);
        System.out.println(bag);
        giveSurpriseAndHug.put(bag);
        System.out.println(giveSurpriseAndHug);
        System.out.println("next lifo");

        bag = factoryBag.makeBag("LIFO");
        bag.put(iSurprisesArray);
        System.out.println(bag);
        giveSurpriseAndHug.put(bag);
        System.out.println(giveSurpriseAndHug);
        giveSurpriseAndHug.giveWithPassion();
        giveSurpriseAndHug.give();
        System.out.println(giveSurpriseAndHug);
        System.out.println();
        giveSurpriseAndHug.giveAll();
        System.out.println(giveSurpriseAndHug);




    }
}
