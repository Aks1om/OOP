package pr4.task2;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
            new TShirt(Size.M, 1000, "белый"),
            new Pants(Size.L, 2000, "черный"),
            new Skirt(Size.S, 1500, "синий"),
            new Tie(Size.XS, 500, "красный")
        };

        Atelier atelier = new Atelier();
        System.out.println("Женская одежда:");
        atelier.dressWomen(clothes);
        System.out.println("Мужская одежда:");
        atelier.dressMan(clothes);
    }
}
