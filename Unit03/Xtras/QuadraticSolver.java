package Unit03.Xtras;

import java.util.Scanner;

public class QuadraticSolver {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to Quadratic Solver V.06!\nWhat is your first coefficient?(a)\n>");
        double a = scanner.nextDouble();
        System.out.print("\nWhat is your second coefficient?(b)\n>");
        double b = scanner.nextDouble();
        System.out.print("\nWhat is your third coefficient?(c)\n>");
        double c = scanner.nextDouble();

        String formula = "(" + a + " * x^2) + (" + b + " * x) + (" + c + ") = 0";

        // Check discrimanant for negative
        if ((Math.pow(b, 2))+(-4*(a*c)) < 0) {
            System.out.println("'" + formula + "' Does not have any real solutions.");
        } else {
            double left = (-b);
            double right = (Math.sqrt( (Math.pow(b, 2)) + (-4*(a*c))));
            double bottom = (2*a);

            double resultPlus = (left + right)/bottom;
            double resultMinus = (left - right)/bottom;

            System.out.println("The solutions to '" + formula + "' are:\n   x = " + resultPlus + "\n   x = " + resultMinus);
        }


        scanner.close();

    }
}
// javac Unit03\Xtras\QuadraticSolver.java
// java Unit03.Xtras.QuadraticSolver