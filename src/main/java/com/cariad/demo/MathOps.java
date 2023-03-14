package com.cariad.demo;

public class MathOps {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int divide(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return x / y;
    }

    public static int modulo(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Modulo by zero is not allowed.");
        }
        return x % y;
    }

    public static double power(double x, double y) {
        return Math.pow(x, y);
    }

    public static double squareRoot(double x) {
        if (x < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not allowed.");
        }
        return Math.sqrt(x);
    }

    public static double logarithm(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm of a non-positive number is not allowed.");
        }
        return Math.log(x);
    }
}
