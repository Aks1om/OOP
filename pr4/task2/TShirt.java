package pr4.task2;

public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() { System.out.println("Футболка: " + getInfo()); }
    public void dressWomen() { System.out.println("Футболка: " + getInfo()); }
}
