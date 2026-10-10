package pr3.movable;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    private void move(String direction) {
        switch (direction) {
            case "up": topLeft.moveUp(); bottomRight.moveUp(); break;
            case "down": topLeft.moveDown(); bottomRight.moveDown(); break;
            case "left": topLeft.moveLeft(); bottomRight.moveLeft(); break;
            case "right": topLeft.moveRight(); bottomRight.moveRight(); break;
            default: throw new IllegalArgumentException("Unknown direction: " + direction);
        }
    }

    public void moveUp() { move("up"); }
    public void moveDown() { move("down"); }
    public void moveLeft() { move("left"); }
    public void moveRight() { move("right"); }

    public boolean hasSameSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
            && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public String toString() { return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]"; }
}
