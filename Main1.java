import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a number: ");
    int num = scanner.nextInt();

    // Get the first digit by dividing the number by 10 until it is less than 10
    int firstDigit = num;
    while (firstDigit >= 10) {
      firstDigit /= 10;
    }

    // Get the last digit by taking the remainder of the number divided by 10
    int lastDigit = num % 10;

    // Add the first and last digits
    int sum = firstDigit + lastDigit;

    // Check if the sum is even or odd
    if (sum % 2 == 0) {
      System.out.println("The sum of the first and last digits is even.");
    } else {
      System.out.println("The sum of the first and last digits is odd.");
    }
  }
}
