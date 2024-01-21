package Unit02.Topic2_2;

public class Slope {

    private int x1;
    private int x2;
    private int y1;
    private int y2;

    public Slope(int a, int b, int c, int d) {
        x1 = a;
        y1 = b;
        x2 = c;
        y2 = d;
        int xChange = x2-x1;
        int yChange = y2-y1;
        printFraction(yChange, xChange);
    }

    int xChange = x2 - x1;

    int yChange = y2 - y1;

    public void printFraction(int numerator, int denominator) {
        System.out.print(numerator + "/" + denominator);
    }

    public static void main(String[] args) {
        Slope a = new Slope(1,2,5,10);
        System.err.println("\n" + (5*10.0));
    }
}
