package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double start = amount + amount * percent / 100;
        while (start > 0) {
            start -= salary;
            year++;
        }
        return year;
    }
}