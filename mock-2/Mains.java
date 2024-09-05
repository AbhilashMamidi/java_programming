import java.util.Scanner;

public class Mains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of m: ");
        int m = scanner.nextInt();
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Initialize the sum to 0
        int sum = 0;

        // Loop through the range from m to n
        for (int i = m; i <= n; i++) {
            // Convert the current number to a string
            String numString = Integer.toString(i);
            // Loop through each digit in the number
            for (int j = 0; j < numString.length(); j++) {
                // Convert the current digit to an integer
                int digit = Integer.parseInt(Character.toString(numString.charAt(j)));
                // Check if the digit is prime
                if (isPrime(digit)) {
                    // If it's prime, add it to the sum
                    sum += digit;
                }
            }
        }

        // Convert the sum to a string
        String sumString = Integer.toString(sum);
        // Initialize the second largest and second smallest digits to -1
        int secondLargest = -1;
        int secondSmallest = -1;

        // Loop through each digit in the sum
        for (int i = 0; i < sumString.length(); i++) {
            // Convert the current digit to an integer
            int digit = Integer.parseInt(Character.toString(sumString.charAt(i)));
            // Check if the digit is larger than the current second largest
            if (digit > secondLargest) {
                // If it is, update the second largest
                secondLargest = digit;
            }
            // Check if the digit is smaller than the current second smallest
            if (digit < secondSmallest || secondSmallest == -1) {
                // If it is, update the second smallest
                secondSmallest = digit;
            }
        }

        // Calculate the result of the second largest to the power of the second smallest
        int result = (int) Math.pow(secondLargest, secondSmallest);

        // Print the result
        System.out.println("Result: " + result);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
