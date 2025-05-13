package utils;

public class PrintUtils {

    public static void print(Object message) {
        System.out.println(message);
    }

    public static void printLine() {
        System.out.println("----------------------------");
    }

    public static void printFormatted(String format, Object... args) {
        System.out.printf((format) + "%n", args);
    }
}
