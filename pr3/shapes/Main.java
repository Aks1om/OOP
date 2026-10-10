package pr3.shapes;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.5, "red", false),
            new Rectangle(4, 6, "blue", true),
            new Square(3, "green", true)
        };

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }
}
