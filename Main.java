package Shapesss;
//Anas Alsubaie
public class Main {
    public static void main(String[] args) {
//First Check default then try other inputs
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape2 = new Shape("red", false);
        System.out.println(shape2);
//First Check Default then try other inputs
        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());
//Try other inputs
        Circle circle2 = new Circle(5.0, "blue", true);
        System.out.println(circle2);
        System.out.println("Area = " + circle2.getArea());
        System.out.println("Perimeter = " + circle2.getPerimeter());
//First Check Default then try other inputs
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
//Try other inputs
        Rectangle rectangle2 = new Rectangle(4.0, 6.0, "yellow", false);
        System.out.println(rectangle2);
        System.out.println("Area = " + rectangle2.getArea());
        System.out.println("Perimeter = " + rectangle2.getPerimeter());
//First Check Default then try other inputs
        Square square = new Square();
        System.out.println(square);
        System.out.println("Area = " + square.getArea());
        System.out.println("Perimeter = " + square.getPerimeter());
//Try other inputs
        Square square2 = new Square(5.0, "black", true);
        System.out.println(square2);
        System.out.println("Area = " + square2.getArea());
        System.out.println("Perimeter = " + square2.getPerimeter());
//Try other inputs
        square2.setSide(7.0);
        System.out.println("After setSide(7.0): " + square2);
    }
}