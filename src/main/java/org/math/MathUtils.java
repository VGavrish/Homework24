package org.math;

public class MathUtils {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        if (a == 0) {
            throw new ArithmeticException("Can't divide by zero.");
        }
        return (double) a / b;
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static int abs(int number) {
        return Math.abs(number);
    }

    public static double sqrt(double nummber) {
        return Math.sqrt(nummber);
    }
}
