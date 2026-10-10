package pr1.task6;

public class Task6Harmonic {

    public static void main(String[] args) {
        System.out.println("First 10 terms of the harmonic sequence 1/n:");
        for (int n = 1; n <= 10; n++) {
            double value = 1.0 / n;
            System.out.printf("%2d: 1/%-2d = %.6f%n", n, n, value);
        }
    }
}
