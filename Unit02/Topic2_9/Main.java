package Unit02.Topic2_9;

public class Main {
  public static void main(String[] args) {
    String oldSeq = "110000011";
    String segment = "11";
    String newSeq = oldSeq.substring(0, oldSeq.indexOf(segment)) + oldSeq.substring(oldSeq.indexOf(segment)+segment.length(), oldSeq.length());
    System.err.println(newSeq);
  }
 
}
