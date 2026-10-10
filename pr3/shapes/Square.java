package pr3.shapes;

public class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String toString() {
        return "Square[side=" + width + ", color=" + getColor() + ", filled=" + isFilled() + "]";
    }
}
