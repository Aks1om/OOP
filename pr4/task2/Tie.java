package pr4.task2;

public class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    public void dressMan() { System.out.println("Галстук: " + getInfo()); }
}
