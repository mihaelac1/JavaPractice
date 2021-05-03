package JavaPracticeGitHub.C20_Generics;

public class Dolphin extends AquaticAnimal {

    public Dolphin(String name){
        super(name);
    }

    @Override
    public boolean equals(Object obj){
        if(this.getClass() != obj.getClass()){
            return false;
        }

        return super.equals(obj);
    }
}
