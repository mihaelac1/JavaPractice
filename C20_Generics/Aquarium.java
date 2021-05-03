package JavaPracticeGitHub.C20_Generics;

import java.util.ArrayList;

public class Aquarium {
    private String description;
    private ArrayList<AquaticAnimal> fishes = new ArrayList<>();

    public Aquarium(String description){
        this.description = description;
    }

    public boolean addFish(AquaticAnimal fish){
        if(fishes.contains(fish)){
            System.out.println("Error: Fish " + fish.getName() + "is already in aquarium.");
            return false;
        }
        fishes.add(fish);
        System.out.println("Fish " + fish.getName() + " added in aquarium.");
        return true;
    }

    public AquaticAnimal removeFish(){
        return fishes.remove(fishes.size() - 1);
    }

    public int numberOfFishes(){
        return fishes.size();
    }

    public boolean isEmpty(){
        return fishes.isEmpty();
    }

    public void mergeAquarium(Aquarium other){
        while (!other.isEmpty()){
            this.addFish(other.removeFish());
        }
    }



}
