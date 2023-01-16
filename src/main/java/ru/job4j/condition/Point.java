package ru.job4j.condition;

import ru.job4j.calculate.Calculator;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        byte degree = 2;
        return Math.sqrt(Math.pow((x2 - x1), degree) + Math.pow((y2 - y1), degree));
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}