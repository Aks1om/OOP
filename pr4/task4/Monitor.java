package pr4.task4;

public class Monitor {
    private final double diagonal;

    public Monitor(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getDiagonal() { return diagonal; }
    @Override public String toString() { return diagonal + " inches"; }
}
