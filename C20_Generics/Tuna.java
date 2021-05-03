package JavaPracticeGitHub.C20_Generics;

public class Tuna extends AquaticAnimal{

    public Tuna(String name){
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
