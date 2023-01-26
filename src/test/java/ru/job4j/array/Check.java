package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean el : data) {
            if (el != data[0]) {
                return false;
            }
        }
        return result;
    }
}