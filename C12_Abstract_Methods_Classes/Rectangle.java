package JavaPracticeGitHub.C12_Abstract_Methods_Classes;

public class Rectangle extends Shape {
    private int width; //width of rectangle
    private int height; //height of rectangle

    //Constructors
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(String text, String material, int width, int height){
        super(text, material);
        this.width = width;
        this.height = height;
    }

    //Functionalities
    public void displayRectangleHeight(){
        System.out.println("Class Rectangle: Rectangle height is: " + height);
    }

    //Override the abstract method from the abstract class Shape
    @Override
    public double getSize(){
        return this.width * this.height;
    }


    //Override for the three important methods inherited from the Object - toString(), equals(obj), hashCode()
    @Override
    public String toString(){
        return "Rectangle: height is: " + this.height + ", width is: " + this.width + ", " + super.toString();
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null || this.getClass() != obj.getClass() ){
            return false;
        }
        Rectangle rectangleObj = (Rectangle) obj;
        if(super.equals(rectangleObj) &&
        this.width == rectangleObj.width &&
        this.height == rectangleObj.height){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        final int prime1 = 31;
        final int prime2 = 17;
        int result = super.hashCode();
        result = result * prime1 + this.height;
        result = result * prime2 + this.width;
        return result;
    }
}
