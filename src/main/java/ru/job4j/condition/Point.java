package ru.job4j.condition;

import ru.job4j.calculate.Calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        int diff1 = Calculator.diff(x1, x2);
        int diff2 = Calculator.diff(y1, y2);
        byte degree = 2;
        double arg1 = Math.pow(diff1, degree);
        double arg2 = Math.pow(diff2, degree);
        return Math.sqrt(arg1 + arg2);
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}