/*
package pr1;

public class Task3ArrayInit {
    public static void main(String[] args) {
        int[] numbers = {4, 7, 12, -3, 10, 5};
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f%n", average);
    }
}
*/
/*
package pr1;

import java.util.Arrays;
import java.util.Scanner;

public class Task4ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Array length must be positive.");
            return;
        }

        int[] a = new int[n];
        int i = 0;
        do {
            System.out.print("a[" + i + "] = ");
            a[i] = scanner.nextInt();
            i++;
        } while (i < n);

        int sumDoWhile = 0;
        i = 0;
        do {
            sumDoWhile += a[i++];
        } while (i < n);

        int sumWhile = 0;
        int min = a[0];
        int max = a[0];
        i = 0;
        while (i < n) {
            sumWhile += a[i];
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
            i++;
        }

        System.out.println("Array: " + Arrays.toString(a));
        System.out.println("Sum (do-while) = " + sumDoWhile);
        System.out.println("Sum (while) = " + sumWhile);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}
*/
/*
package pr1;

public class Task5CommandLine {
    public static void main(String[] args) {
        System.out.println("Command-line arguments:");
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s%n", i, args[i]);
        }
        if (args.length == 0) {
            System.out.println("No arguments were supplied.");
        }
    }
}
*/
/*
package pr1;

public class Task6Harmonic {
    public static void main(String[] args) {
        System.out.println("First 10 terms of the harmonic sequence 1/n:");
        for (int n = 1; n <= 10; n++) {
            double value = 1.0 / n;
            System.out.printf("%2d: 1/%-2d = %.6f%n", n, n, value);
        }
    }
}
*/
/*
package pr1;

public class Task7Factorial {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is undefined for negative integers");
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
*/
