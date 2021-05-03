package JavaPracticeGitHub.C20_Generics;

import java.util.ArrayList;

public class AquariumGenerics <E>{
    private String description;

    // 2. fishes have the type of the aquarium
    private ArrayList<E> fishes = new ArrayList<>();

    public AquariumGenerics(String description) {
        this.description = description;
    }

    // 3. adding a new fish... of the same type E as the aquarium
    public boolean addFish(E fish) {
        if (fishes.contains(fish)) {
            // 3.1 Fixing the error implies a forced casting
            System.out.println("Error: Fish " +
                    ((AquaticAnimal)fish).getName() +
                    " is already in aquarium.");
            return false;
        }

        fishes.add(fish);
        // 3.2. Fixing the error implies a forced casting
        System.out.println("Fish " +
                ((AquaticAnimal)fish).getName() +
                " added in aquarium.");
        return true;
    }

    // 4. removing fish of type E
    public E removeFish() {
        return fishes.remove(fishes.size() - 1);
    }

    public int numberOfFishes() {
        return fishes.size();
    }

    public boolean isEmpty() {
        return fishes.isEmpty();
    }

    // 5. Reinforce merge of same type of aquarium
    public void mergeAquarium(AquariumGenerics<E> other) {
        while(!other.isEmpty()) {
            this.addFish(other.removeFish());
        }
    }
}
