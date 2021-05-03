package JavaPracticeGitHub.C12_Abstract_Methods_Classes;

import java.util.ArrayList;

public class MainFormeGeometrice {
    public static void main(String[] args) {
        //Testing class Shape
//        Shape shape1 = new Shape();
//        Shape shape2 = new Shape("Here is my text", "plastic");
//        Shape shape3 = new Shape("Another text", "plastic");
//        Shape shape4 = shape3;
//        Shape shape5 = new Shape();
//        System.out.println("Get size method on shape: " + shape2.getSize());
//        System.out.println("toString shape2 : " + shape2);
//        System.out.println("equals shape 1 vs shape5: " + shape1.equals(shape5));
//        System.out.println("equals shape 3 vs shape4: " + shape3.equals(shape4));
//        System.out.println("hashCode shape 3: " + shape3.hashCode());
//        System.out.println("hashCode shape 4: " + shape4.hashCode());
//        System.out.println("hashCode shape 2: " + shape2.hashCode());
//        System.out.println("hashCode shape 1: " + shape1.hashCode());
//        System.out.println("hashCode shape 5: " + shape5.hashCode());

        // Testing class Triangle
        Triangle triangle1 = new Triangle(6,5);
        Triangle triangle2 = new Triangle(6, 5);
        System.out.println("equals triangle 1 vs triangle 2: " + triangle1.equals(triangle2));
        System.out.println("Hash code triangle 1: " + triangle1.hashCode());
        System.out.println("Hash code triangle 2: " + triangle2.hashCode());
        System.out.println(triangle1);

        Triangle triangle3 = new Triangle("My 3th triangle!", "plastic", 9, 10);
        Triangle triangle4 = new Triangle("My 4th triangle.", "plastic", 9, 10);
        Triangle triangle5 = new Triangle("My 5th triangle.", "wood", 9, 10);
        System.out.println(triangle5);
        System.out.println("equals triangle 3 vs triangle 4: " + triangle3.equals(triangle4));
        System.out.println("hash code triangle 3: " + triangle3.hashCode());
        System.out.println("hash code triangle 4: " + triangle4.hashCode());
        System.out.println("hash code triangle 5: " + triangle5.hashCode());
        System.out.println("equals triangle 3 vs triangle 5: " + triangle3.equals(triangle5));
        System.out.println("get size triangle 1 : " + triangle1.getSize());
        System.out.println("get size triangle 3 : " + triangle3.getSize());
        System.out.println("get size triangle 4 : " + triangle4.getSize());

        //Testing class Rectangle
        Rectangle rectangle1 = new Rectangle(3, 8);
        Rectangle rectangle2 = new Rectangle(5, 8);
        Rectangle rectangle3 = new Rectangle(3, 8);
        System.out.println("ToString: " + rectangle2);
        System.out.println("equals rectangle 1 vs rectangle 2: " + rectangle1.equals(rectangle2));
        System.out.println("equals rectangle 1 vs rectangle 3: " + rectangle1.equals(rectangle3));
        System.out.println("hashCode rectangle 1: " + rectangle1.hashCode());
        System.out.println("hashCode rectangle 2: " + rectangle2.hashCode());
        System.out.println("hashCode rectangle 3: " + rectangle3.hashCode());
        System.out.println("size rectangle 1: " + rectangle1.getSize());
        System.out.println("size rectangle 2: " + rectangle2.getSize());
        System.out.println("size rectangle 3: " + rectangle3.getSize());
        Rectangle rectangle4 = new Rectangle("My 4th rectangle!", "wood", 4, 7);
        Rectangle rectangle5 = new Rectangle("My 5th rectangle!", "wood", 4, 7);
        Rectangle rectangle6 = new Rectangle("My 6th rectangle!", "plastic", 4, 7);
        System.out.println("ToString rectangle 4: " + rectangle4);
        System.out.println("ToString rectangle 6: " + rectangle6);
        System.out.println("equals rectangle 4 vs rectangle 5: " + rectangle4.equals(rectangle5));
        System.out.println("equals rectangle 4 vs rectangle 6: " + rectangle4.equals(rectangle6));
        System.out.println("hashCode rectangle 4: " + rectangle4.hashCode());
        System.out.println("hashCode rectangle 5: " + rectangle5.hashCode());
        System.out.println("hashCode rectangle 6: " + rectangle6.hashCode());


//Upcasting 7
        System.out.println("\n\t Upcasting 7");
        ArrayList<Shape> myShapes = new ArrayList<>();
//        myShapes.add(shape1);
//        myShapes.add(shape2);
        myShapes.add(triangle1);
        myShapes.add(triangle3);
        myShapes.add(rectangle1);
        myShapes.add(rectangle4);
        for(Shape shapes : myShapes){
            System.out.println("toString method: " + shapes);
            System.out.println("getSize method: " + shapes.getSize());
            if(shapes instanceof Triangle){
                ((Triangle) shapes).displayTriangleHeight();
            }
            if(shapes instanceof Rectangle){
                ((Rectangle) shapes).displayRectangleHeight();
            }
            System.out.println();
        }

    }
}
