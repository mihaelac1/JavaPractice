package JavaPracticeGitHub.C15_NestedClasses;

public class ShapeWorkspace {
    public static void main(String[] args) {
        IShape[] shapes = new IShape[3]; // an array of shapes
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Rectangle();

        for (int i=0; i< shapes.length; i++) {
            shapes[i].printShapeName();
        }
    }
}
