package pr4.task3;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }

    public void purchase() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста.");
            return;
        }
        System.out.println("Покупка: " + products);
        products.clear();
    }
}
