package pr3.movable;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 3);
        System.out.println(point);
        point.moveRight();
        point.moveDown();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(1, 1, 2, 2, 5);
        circle.moveLeft();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(0, 0, 4, 3, 1, 1);
        rectangle.moveDown();
        System.out.println(rectangle + ", same speed=" + rectangle.hasSameSpeed());
    }
}
