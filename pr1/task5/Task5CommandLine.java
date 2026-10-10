package pr1.task5;

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
