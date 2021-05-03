package JavaPracticeGitHub.C10_InheritanceII_Object;

public class Shape {
    private String text; // short text written on the shape
    private String material; // the material from which the shape is made

    //Constructors
    public Shape(){
        this("","");
    }

    public Shape(String text, String material){
        this.text = text;
        this.material = material;
    }

    //Functionalities
    public double getSize(){
        return -1;
    }

    @Override
    public String toString(){
        return "made of " + this.material + ", contains the text: " + this.text;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass() ){
            return false;
        }

        Shape shapeObj = (Shape) obj;

        if(this.material != null && this.material.equals(shapeObj.material)){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = result * prime + ((this.material == null)? 0 : this.material.hashCode());
        return result;
    }
}
