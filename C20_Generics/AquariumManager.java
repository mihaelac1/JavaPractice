package JavaPracticeGitHub.C20_Generics;

public class AquariumManager {
    public static void main(String[] args) {
        Shark shark = new Shark("Jow");
        Tuna tuna = new Tuna("Waty");
        Dolphin dolphin = new Dolphin("Dora");

        Aquarium aquarium1 = new Aquarium("Deep oceans blue");
        aquarium1.addFish(shark);
        aquarium1.addFish(tuna);
        aquarium1.addFish(dolphin);

        System.out.println(aquarium1.numberOfFishes());

        // notice the diamond
        AquariumGenerics<Shark> sharkAquarium = new AquariumGenerics<>("Ferocious beasts");
        sharkAquarium.addFish(shark);
        sharkAquarium.addFish(new Shark("Ferorino"));
        sharkAquarium.addFish(new Shark("Dangerino"));

        // Next two lines trigger compile error, nice!
//        sharkAquarium.addFish(tuna);
//        sharkAquarium.addFish(dolphin);

        // notice the diamond
        AquariumGenerics<Dolphin> dolphinAquarium = new AquariumGenerics<>("Swim with dolphins");
        dolphinAquarium.addFish(dolphin);
        dolphinAquarium.addFish(new Dolphin("Laughy"));
        dolphinAquarium.addFish(new Dolphin("Ginger"));

        System.out.println(sharkAquarium.numberOfFishes());

        // At this point:
        // -> an aquarium would have only one type of fishes
        // -> we cannot merge the 2 aquariums (compile error)
        //    because they contain different kinds of fishes


        // But still we can create aquariums of any type, not only fish..
        AquariumGenerics<Integer> aq3 = new AquariumGenerics<>("An aquarium with numbers??");
        AquariumGenerics<String> aq4 = new AquariumGenerics<>("An aquarium with letters??");

        // No compile error is thrown, but exceptions are raised if used:
//        aq3.addFish(3); // exception ClassCastException
//        aq4.addFish("String"); // exception ClassCastException

    }

    }