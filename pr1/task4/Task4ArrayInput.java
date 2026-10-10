package pr1.task4;

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
