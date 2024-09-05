import java.util.Scanner;

public class Fibonacci1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = in.nextInt();

        long previous = 0;
        long current = 1;
        for (int i = 0; i < n; i++) {
            long next = previous + current;
            System.out.print(current + " ");
            previous = current;
            current = next;
        }
    }
}
