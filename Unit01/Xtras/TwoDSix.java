package Unit01.Xtras;

public class TwoDSix {
    public static void main(String[] args) {
        double a = (Math.random()*6) + 1; // Dice 1 result
        double b = (Math.random()*6) + 1; // Dice 2 result
        System.err.println("Dice 1 : " + (int)a + "\nDice 2: " + (int)b + "\nSum: " + ((int)(a+b)));
    }
}
