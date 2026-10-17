package pr3.shapes;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.5, "RED", false);
        System.out.println(circle);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Color: " + circle.getColor());
        System.out.println("Filled: " + circle.isFilled());
        // circle.getRadius(); // Ошибка: у ссылки Shape нет метода getRadius().

        Circle actualCircle = (Circle) circle;
        System.out.println("Radius: " + actualCircle.getRadius());

        Shape rectangle = new Rectangle(4, 6, "BLUE", true);
        System.out.println(rectangle);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        // rectangle.getLength(); // Ошибка: у ссылки Shape нет метода getLength().

        Shape square = new Square(3, "GREEN", true);
        System.out.println(square);
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        Square actualSquare = (Square) square;
        System.out.println("Side: " + actualSquare.getSide());
    }
}
