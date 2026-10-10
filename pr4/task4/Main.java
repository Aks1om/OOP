package pr4.task4;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(
            ComputerBrand.ASUS,
            new Processor("Intel Core i5"),
            new Memory(16),
            new Monitor(24)
        );
        System.out.println(computer);
    }
}
