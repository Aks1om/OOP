package pr1.task7;

public class Task7Factorial {

    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "Factorial is undefined for negative integers"
            );
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        for (int n = 0; n <= 10; n++) {
            System.out.printf("%d! = %d%n", n, factorial(n));
        }
    }
}
