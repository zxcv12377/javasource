package oop;

public class Calc {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }

    long max(long a, long b) {
        return a > b ? a : b;
    }

    long min(long a, long b) {
        return a > b ? b : a;
    }
}
