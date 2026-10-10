package pr3.shapes;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getArea() { return width * length; }
    public double getPerimeter() { return 2 * (width + length); }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}
