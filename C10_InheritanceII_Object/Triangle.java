package JavaPracticeGitHub.C10_InheritanceII_Object;

public class Triangle extends Shape {
    private int base; // size of the base of triangle
    private int height; // size of the height of triangle

    //Constructors
    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public Triangle(String text, String material, int base, int height){
        super(text, material);
        this.base = base;
        this.height = height;
    }
    //Functionalities
    public void displayTriangleHeight(){
        System.out.println("Triangle height is: " + height);
    }

    @Override
    public double getSize(){
        return (double)(this.base * this.height) / 2;
    }

    @Override
    public String toString(){
        return "Triangle: height is " + this.height + ", base is: " + this.base + ", " + super.toString();
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass() ){
            return false;
        }
        Triangle triangleObj = (Triangle) obj;
        if(super.equals(triangleObj) &&
        this.base == triangleObj.base &&
        this.height == triangleObj.height){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        final int prime1 = 31;
        final int prime2 = 17;
        int result = super.hashCode();
        result = result * prime1 + this.base;
        result = result * prime2 + this.height;
        return result;
    }
}
