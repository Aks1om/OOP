package pr3.movable;

public class MovableRectangle implements Movable {
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public void moveUp() { topLeft.moveUp(); bottomRight.moveUp(); }
    public void moveDown() { topLeft.moveDown(); bottomRight.moveDown(); }
    public void moveLeft() { topLeft.moveLeft(); bottomRight.moveLeft(); }
    public void moveRight() { topLeft.moveRight(); bottomRight.moveRight(); }

    public boolean hasSameSpeed() {
        return topLeft.getXSpeed() == bottomRight.getXSpeed()
            && topLeft.getYSpeed() == bottomRight.getYSpeed();
    }

    @Override
    public String toString() { return "MovableRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]"; }
}
