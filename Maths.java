/**
 * This Has Public Maths Actions
 * - Square Root
 * - Quadratic Formula
 * - Factorial
 * - Power
 */

 import utils.PrintUtils;

public class Maths {
    public static void main(String args[]) {
        PrintUtils.print("This is a maths class");
        quadraticFormula(1, 2, 3);
        PrintUtils.printLine();
    }

    public static int duplicate(int n) {
        return n * n;
    }

    public static int squareRoot(int n) {
        int sqrt = 0;
        while (sqrt * sqrt < n) {
            sqrt++;
        }
        return sqrt;
    }

    public static void quadraticFormula(int a, int b, int c) {
        /**
         * Formula:
         * x = (-b +- sqrt(b^2 - 4ac)) / 2a
         */

         int denominator = 2 * a;
         int numeratorHalf = 1 * (-1 * b);
         int numerator2ndHalf = squareRoot(b * b - 4 * a * c);
         int x = (numeratorHalf + numerator2ndHalf) / denominator;
         PrintUtils.printFormatted("x = %d", x);
    }
}
