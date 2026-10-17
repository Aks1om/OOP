package pr1.task3;

public class Task3ArrayInit {

    public static void main(String[] args) {
        int[] numbers = { 4, 7, 12, -3, 10, 5 };
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        System.out.println("Array: " + java.util.Arrays.toString(numbers));
        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f%n", average);
    }
}
