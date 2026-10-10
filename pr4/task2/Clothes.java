package pr4.task2;

public abstract class Clothes {
    protected Size size;
    protected double cost;
    protected String color;

    protected Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public String getInfo() {
        return "размер=" + size + " (EU " + size.getEuroSize() + "), стоимость="
            + cost + ", цвет=" + color;
    }
}
