package Unit03.Topic3_5;

public class Main {
  public static void main(String[] args) {
String alpha = new String("APCS");

String beta = new String("APCS");

String delta = alpha;

System.out.println(alpha.equals(beta));

System.out.println(alpha == beta);

System.out.println(alpha == delta);
  }

}

// javac Unit03/Topic3_5/Main.java; java Unit03.Topic3_5.Main