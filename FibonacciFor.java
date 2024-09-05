public class FibonacciFor {
  public static void main(String[] args) {
    int previous = 0;
    int current = 1;
    int sum = 0;

    for (int i = 0; current < 1000; i++) {
		System.out.println(current);
      int next = previous + current;
      previous = current;
      current = next;

    int hundreds = current / 100;
      int tens = (current % 100) / 10;
      int ones = current % 10;

      sum = sum + hundreds + tens + ones;
    }

    System.out.println("Sum: " + sum);
  }
}
