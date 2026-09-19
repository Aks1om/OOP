/*
package pr4;

// Практическая работа №4. Задание 1. Времена года.
enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25) {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10);

    private final int averageTemperature;

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}

public class Task1Seasons {
    public static void printFavoriteSeason(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }

    public static void main(String[] args) {
        Season favoriteSeason = Season.SUMMER;
        printFavoriteSeason(favoriteSeason);

        for (Season season : Season.values()) {
            System.out.println(season + " " + season.getAverageTemperature() + " " + season.getDescription());
        }
    }
}
*/

/*
package pr4;

// Практическая работа №4. Задание 2. Ателье.
enum Size {
    XXS(32) {
        @Override
        public String getDescription() {
            return "Детский размер";
        }
    },
    XS(34),
    S(36),
    M(38),
    L(40);

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public String getDescription() {
        return "Взрослый размер";
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    protected Size size;
    protected double cost;
    protected String color;

    public Clothes(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    public String getInfo() {
        return "размер=" + size + ", стоимость=" + cost + ", цвет=" + color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Футболка: " + getInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("Футболка: " + getInfo());
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны: " + getInfo());
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны: " + getInfo());
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWomen() {
        System.out.println("Юбка: " + getInfo());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Галстук: " + getInfo());
    }
}

class Atelier {
    public static void dressWomen(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                ((WomenClothing) item).dressWomen();
            }
        }
    }

    public static void dressMan(Clothes[] clothes) {
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                ((MenClothing) item).dressMan();
            }
        }
    }
}

public class Task2Atelier {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new TShirt(Size.M, 1000, "белый"),
                new Pants(Size.L, 2000, "черный"),
                new Skirt(Size.S, 1500, "синий"),
                new Tie(Size.XS, 500, "красный")
        };

        Atelier.dressWomen(clothes);
        Atelier.dressMan(clothes);
    }
}
*/

/*
package pr4;

// Практическая работа №4. Задание 3. Интернет-магазин.
enum Catalog {
    BOOKS,
    ELECTRONICS,
    CLOTHES
}

enum Product {
    BOOK(Catalog.BOOKS),
    PHONE(Catalog.ELECTRONICS),
    T_SHIRT(Catalog.CLOTHES);

    private final Catalog catalog;

    Product(Catalog catalog) {
        this.catalog = catalog;
    }

    public Catalog getCatalog() {
        return catalog;
    }
}

class User {
    private final String login;
    private final String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean authorize(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }
}

class Cart {
    private Product product;

    public void add(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}

public class Task3InternetShop {
    public static void main(String[] args) {
        User user = new User("user", "password");

        if (user.authorize("user", "password")) {
            for (Catalog catalog : Catalog.values()) {
                System.out.println(catalog);
            }

            Catalog selectedCatalog = Catalog.BOOKS;
            for (Product product : Product.values()) {
                if (product.getCatalog() == selectedCatalog) {
                    System.out.println(product);
                }
            }

            Cart cart = new Cart();
            cart.add(Product.BOOK);
            System.out.println("Покупка: " + cart.getProduct());
        }
    }
}
*/

/*
package pr4;

// Практическая работа №4. Задание 4. Компьютер.
enum ComputerBrand {
    ASUS,
    HP,
    LENOVO
}

class Processor {
    private String model;

    public Processor(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}

class Memory {
    private int size;

    public Memory(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return size + " GB";
    }
}

class Monitor {
    private double diagonal;

    public Monitor(double diagonal) {
        this.diagonal = diagonal;
    }

    @Override
    public String toString() {
        return diagonal + " inches";
    }
}

class Computer {
    private ComputerBrand brand;
    private Processor processor;
    private Memory memory;
    private Monitor monitor;

    public Computer(ComputerBrand brand, Processor processor, Memory memory, Monitor monitor) {
        this.brand = brand;
        this.processor = processor;
        this.memory = memory;
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Computer: " + brand + ", processor=" + processor + ", memory=" + memory + ", monitor=" + monitor;
    }
}

public class Task4Computer {
    public static void main(String[] args) {
        Computer computer = new Computer(
                ComputerBrand.ASUS,
                new Processor("Processor"),
                new Memory(16),
                new Monitor(24)
        );
        System.out.println(computer);
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 1. Shape и наследование.
class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getType() {
        return "Shape";
    }

    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return getType() + ": color=" + color + ", filled=" + filled;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String getType() {
        return "Circle";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return getType() + ": radius=" + radius + ", color=" + color + ", filled=" + filled;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    @Override
    public String getType() {
        return "Rectangle";
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return getType() + ": width=" + width + ", length=" + length + ", color=" + color + ", filled=" + filled;
    }
}

class Square extends Rectangle {
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public String getType() {
        return "Square";
    }

    @Override
    public String toString() {
        return getType() + ": side=" + width + ", color=" + color + ", filled=" + filled;
    }
}

public class Task41Shape {
    public static void main(String[] args) {
        Shape shape = new Circle(5.5, "RED", false);
        System.out.println(shape);
        System.out.println(shape.getType());
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        shape = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(shape);
        System.out.println(shape.getType());
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());

        shape = new Square(6.6, "RED", false);
        System.out.println(shape);
        System.out.println(shape.getType());
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 2. Phone.
class Phone {
    String number;
    String model;
    double weight;

    public Phone() {
    }

    public Phone(String number, String model) {
        this();
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println(number);
        }
    }
}

public class Task41Phone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("111", "Model1", 100);
        Phone phone2 = new Phone("222", "Model2", 120);
        Phone phone3 = new Phone("333", "Model3", 140);

        System.out.println(phone1.number + " " + phone1.model + " " + phone1.weight);
        System.out.println(phone2.number + " " + phone2.model + " " + phone2.weight);
        System.out.println(phone3.number + " " + phone3.model + " " + phone3.weight);

        phone1.receiveCall("Иван");
        System.out.println(phone1.getNumber());
        phone2.receiveCall("Петр");
        System.out.println(phone2.getNumber());
        phone3.receiveCall("Сергей");
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Иван", "111");
        phone1.sendMessage("111", "222", "333");
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 3. Person.
class Person {
    String fullName;
    int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " двигается");
    }

    public void talk() {
        System.out.println(fullName + " говорит");
    }
}

public class Task41Person {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван", 20);

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 4. Матрица.
class Matrix {
    private double[][] matrix;
    private int rows;
    private int columns;

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    public Matrix add(Matrix other) {
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[i][j] + other.matrix[i][j];
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(double number) {
        double[][] result = new double[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix[i][j] * number;
            }
        }
        return new Matrix(result);
    }

    public Matrix multiply(Matrix other) {
        double[][] result = new double[rows][other.columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < other.columns; j++) {
                for (int k = 0; k < columns; k++) {
                    result[i][j] += matrix[i][k] * other.matrix[k][j];
                }
            }
        }
        return new Matrix(result);
    }

    public void print() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Task41Matrix {
    public static void main(String[] args) {
        Matrix matrix1 = new Matrix(new double[][]{{1, 2}, {3, 4}});
        Matrix matrix2 = new Matrix(new double[][]{{5, 6}, {7, 8}});

        matrix1.add(matrix2).print();
        matrix1.multiply(2).print();
        matrix1.multiply(matrix2).print();
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 5. Читатели библиотеки.
class Book {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }
}

class Reader {
    String fullName;
    int readerTicket;
    String faculty;
    String dateOfBirth;
    String phone;

    public Reader(String fullName, int readerTicket, String faculty, String dateOfBirth, String phone) {
        this.fullName = fullName;
        this.readerTicket = readerTicket;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги");
    }

    public void takeBook(String... books) {
        System.out.print(fullName + " взял книги: ");
        printNames(books);
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги");
    }

    public void returnBook(String... books) {
        System.out.print(fullName + " вернул книги: ");
        printNames(books);
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].name);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    private void printNames(String[] books) {
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i]);
            if (i < books.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}

public class Task41Reader {
    public static void main(String[] args) {
        Reader[] readers = {
                new Reader("Петров В. В.", 1, "Факультет", "01.01.2000", "111")
        };

        Book book1 = new Book("Приключения", "Автор 1");
        Book book2 = new Book("Словарь", "Автор 2");
        Book book3 = new Book("Энциклопедия", "Автор 3");

        readers[0].takeBook(3);
        readers[0].takeBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].takeBook(book1, book2, book3);

        readers[0].returnBook(3);
        readers[0].returnBook("Приключения", "Словарь", "Энциклопедия");
        readers[0].returnBook(book1, book2, book3);
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 6. Employer и Manager.
class Employer {
    protected String firstName;
    protected String lastName;
    protected double income;

    public Employer(String firstName, String lastName, double income) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.income = income;
    }

    public double getIncome() {
        return income * 12;
    }
}

class Manager extends Employer {
    private double averageSum;

    public Manager(String firstName, String lastName, double income, double averageSum) {
        super(firstName, lastName, income);
        this.averageSum = averageSum;
    }

    @Override
    public double getIncome() {
        return super.getIncome() + averageSum;
    }
}

public class Task41Employer {
    public static void main(String[] args) {
        Employer employer = new Manager("Иван", "Иванов", 50000, 100000);
        System.out.println(employer.getIncome());

        Employer[] employers = {
                new Employer("Петр", "Петров", 40000),
                new Manager("Сергей", "Сергеев", 50000, 100000)
        };

        for (Employer item : employers) {
            System.out.println(item.getIncome());
        }
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 7. Учащийся, Школьник, Студент.
class Pupil {
}

class SchoolBoy extends Pupil {
}

class Student extends Pupil {
}

public class Task41Pupil {
    public static void main(String[] args) {
        Pupil[] pupils = {
                new SchoolBoy(),
                new Student(),
                new SchoolBoy(),
                new Student()
        };

        System.out.println("Студенты:");
        for (Pupil pupil : pupils) {
            if (pupil instanceof Student) {
                System.out.println(pupil.getClass().getSimpleName());
            }
        }

        System.out.println("Школьники:");
        for (Pupil pupil : pupils) {
            if (pupil instanceof SchoolBoy) {
                System.out.println(pupil.getClass().getSimpleName());
            }
        }
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 8. Абстрактный Shape.
abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape: color=" + color + ", filled=" + filled;
    }
}

class Circle extends Shape {
    protected double radius;

    public Circle() {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }

    public Circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Shape: circle, radius: " + radius + ", color: " + color;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Shape: rectangle, width: " + width + ", length: " + length + ", color: " + color;
    }
}

class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        width = side;
        length = side;
    }

    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    @Override
    public void setLength(double side) {
        setSide(side);
    }

    @Override
    public String toString() {
        return "Shape: square, side: " + getSide() + ", color: " + color;
    }
}

public class Task41AbstractShape {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());

        Circle c1 = (Circle) s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape();

        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle) s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle) s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 9. Мебель.
abstract class Furniture {
    public abstract String getName();
}

class Table extends Furniture {
    @Override
    public String getName() {
        return "Стол";
    }
}

class Chair extends Furniture {
    @Override
    public String getName() {
        return "Стул";
    }
}

class FurnitureShop {
    private Furniture[] furniture;

    public FurnitureShop(Furniture[] furniture) {
        this.furniture = furniture;
    }

    public void printFurniture() {
        for (Furniture item : furniture) {
            System.out.println(item.getName());
        }
    }
}

public class Task41Furniture {
    public static void main(String[] args) {
        Furniture[] furniture = {
                new Table(),
                new Chair()
        };

        FurnitureShop shop = new FurnitureShop(furniture);
        shop.printFurniture();
    }
}
*/

/*
package pr4;

// Практическая работа №4.1. Задание 10. Транспортные средства.
abstract class Transport {
    protected double speed;
    protected double passengerPricePerKm;
    protected double cargoPricePerKmPerKg;

    public Transport(double speed, double passengerPricePerKm, double cargoPricePerKmPerKg) {
        this.speed = speed;
        this.passengerPricePerKm = passengerPricePerKm;
        this.cargoPricePerKmPerKg = cargoPricePerKmPerKg;
    }

    public double getTime(double distance) {
        return distance / speed;
    }

    public double getPassengerCost(double distance, int passengers) {
        return distance * passengerPricePerKm * passengers;
    }

    public double getCargoCost(double distance, double cargoWeight) {
        return distance * cargoPricePerKmPerKg * cargoWeight;
    }
}

class Car extends Transport {
    public Car(double speed, double passengerPricePerKm, double cargoPricePerKmPerKg) {
        super(speed, passengerPricePerKm, cargoPricePerKmPerKg);
    }
}

class Airplane extends Transport {
    public Airplane(double speed, double passengerPricePerKm, double cargoPricePerKmPerKg) {
        super(speed, passengerPricePerKm, cargoPricePerKmPerKg);
    }
}

class Train extends Transport {
    public Train(double speed, double passengerPricePerKm, double cargoPricePerKmPerKg) {
        super(speed, passengerPricePerKm, cargoPricePerKmPerKg);
    }
}

class Ship extends Transport {
    public Ship(double speed, double passengerPricePerKm, double cargoPricePerKmPerKg) {
        super(speed, passengerPricePerKm, cargoPricePerKmPerKg);
    }
}

public class Task41Transport {
    public static void printInfo(Transport transport, double distance, int passengers, double cargoWeight) {
        System.out.println("Время: " + transport.getTime(distance));
        System.out.println("Стоимость перевозки пассажиров: " + transport.getPassengerCost(distance, passengers));
        System.out.println("Стоимость перевозки груза: " + transport.getCargoCost(distance, cargoWeight));
    }

    public static void main(String[] args) {
        double distance = 100;
        int passengers = 2;
        double cargoWeight = 10;

        printInfo(new Car(80, 2, 0.1), distance, passengers, cargoWeight);
        printInfo(new Airplane(800, 10, 0.5), distance, passengers, cargoWeight);
        printInfo(new Train(100, 3, 0.2), distance, passengers, cargoWeight);
        printInfo(new Ship(40, 4, 0.15), distance, passengers, cargoWeight);
    }
}
*/
