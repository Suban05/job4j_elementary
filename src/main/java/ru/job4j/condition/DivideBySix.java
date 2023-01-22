package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String rsl;
        if (divBy3(number) && divBy2(number)) {
            rsl = "The number divides by 6.";
        } else if (divBy3(number) && !divBy2(number)) {
            rsl = "The number divides by 3, but it isn't the even number.";
        } else if (!divBy3(number) && divBy2(number)) {
            rsl = "The number doesn't divide by 3, but it is the even number.";
        } else {
            rsl = "The number doesn't divide by 3 and it isn't the even number.";
        }
        return rsl;
    }

    private static boolean divBy3(int num) {
        return num % 3 == 0;
    }

    private static boolean divBy2(int num) {
        return num % 2 == 0;
    }
}