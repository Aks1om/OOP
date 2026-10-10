package pr4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = new User("user", "password");
        System.out.print("Логин: ");
        String login = scanner.nextLine();
        System.out.print("Пароль: ");
        String password = scanner.nextLine();

        if (!user.authorize(login, password)) {
            System.out.println("Неверный логин или пароль.");
            return;
        }

        Cart cart = new Cart();
        while (true) {
            System.out.println("Каталоги:");
            Catalog[] catalogs = Catalog.values();
            for (int i = 0; i < catalogs.length; i++) {
                System.out.println((i + 1) + ". " + catalogs[i]);
            }
            System.out.println("0. Купить и выйти");
            System.out.print("Выберите каталог: ");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 0) {
                cart.purchase();
                break;
            }
            if (choice < 1 || choice > catalogs.length) {
                System.out.println("Нет такого каталога.");
                continue;
            }

            Catalog selected = catalogs[choice - 1];
            Product[] products = Product.values();
            int number = 1;
            for (Product product : products) {
                if (product.getCatalog() == selected) {
                    System.out.println(number++ + ". " + product);
                }
            }
            System.out.print("Добавить товар по номеру (0 — пропустить): ");
            int productChoice = Integer.parseInt(scanner.nextLine());
            if (productChoice > 0) {
                number = 0;
                for (Product product : products) {
                    if (product.getCatalog() == selected && ++number == productChoice) {
                        cart.add(product);
                        System.out.println("Добавлено: " + product);
                        break;
                    }
                }
            }
            System.out.println("В корзине: " + cart.getProducts());
        }
    }
}
