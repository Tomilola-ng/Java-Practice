/**
 * Prints the first n fibonacci numbers.
 */

import java.util.logging.Logger;


public class FibonacciTomi {
    private static final Logger LOGGER = Logger.getLogger(FibonacciTomi.class.getName());

    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            LOGGER.info(String.valueOf(a));
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}