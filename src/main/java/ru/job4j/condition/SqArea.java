package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double l = h * k;
        return l * h;
    }

    public static void evalAndWriteSquareToConsole(int p, int k, int s) {
        double result = SqArea.square(p, k);
        System.out.println(" p = " + p + ", k = " + k + ", s = " + s + ", real = " + result);
    }

    public static void main(String[] args) {
        evalAndWriteSquareToConsole(4, 1, 1);
        evalAndWriteSquareToConsole(6, 2, 2);
    }
}