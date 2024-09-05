public class Fibonaccis {
  public static void main(String[] args) {
    int previous = 0;
    int current = 1;

    for (int i = 0; i < 10; i++) {
      System.out.println(current);
      int next = previous + current;
      previous = current;
      current = next;
    }
  }
}
