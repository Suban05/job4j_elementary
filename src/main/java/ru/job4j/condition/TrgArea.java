package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double diff1 = p - a;
        double diff2 = p - b;
        double diff3 = p - c;
        return Math.sqrt(p * diff1 * diff2 * diff3);
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