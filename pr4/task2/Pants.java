package pr4.task2;

public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() { System.out.println("Штаны: " + getInfo()); }
    public void dressWomen() { System.out.println("Штаны: " + getInfo()); }
}
