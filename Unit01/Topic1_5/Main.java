package Unit01.Topic1_5;

public class Main {
  public static int randRange(int min, int max) {
      int a = (max-min) + 1;
      return (int) ((Math.random() * a)) + min;
  }
  public static void main(String[] args) {
    // Your code goes here
    Integer a = 5;
    Integer.parseInt("5");
    System.err.println(a.getClass());
    System.err.println(randRange(9, 12));

  }
  
}
