package Studying;

public class Studying {
    public static int hailstoneLength(int n) {
        int result = 0;
        if (n == 1) {
            result++;
        } else if (n % 2 == 0) {
            result++;
            result += hailstoneLength(n / 2);
        } else {
            result++;
            result += hailstoneLength((3 * n) + 1);
        }
        return result;
    }

    public static double propLong(int n) {
        double count = 0;
        for (double i = 1; i < n; i++) {
            if (hailstoneLength((int) i) > i) {
                // is long
                count++;
            }
        }
        return (double) (count / n);
    }

    public static void main(String[] args) {
        System.out.println(propLong(10));
    }
}
