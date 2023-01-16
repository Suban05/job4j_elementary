package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void evalAndWriteSquareToConsole(int a, int b, int c) {
        double rsl = TrgArea.area(a, b, c);
        System.out.printf("area (%s, %s, %s) = %s%n", a, b, c, rsl);
    }

    public static void main(String[] args) {
        evalAndWriteSquareToConsole(2, 2, 2);
        evalAndWriteSquareToConsole(3, 4, 5);
    }
}