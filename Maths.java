/**
 * This Has Public Maths Actions
 * - Square Root
 * - Quadratic Formula
 * - Factorial
 * - Power
 */

public class Maths {
    public static void main(String args[]) {
        System.out.println("This is a maths class");
        System.out.println("Result: " + duplicate(5));
        System.out.println("Square Root: " + squareRoot(9));
        // System.out.println(quadraticFormula(2, 3, 4));
        // System.out.println(factorial(5));
        // System.out.println(power(2, 3));
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
}
