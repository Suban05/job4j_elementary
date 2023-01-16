package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    private static void checkConvertingRubToForeignCurrency(float in, float expected, float out) {
        boolean passed = expected == out;
        System.out.println(in + " rubles are " + expected + ". Test result : " + passed);
    }

    public static void main(String[] args) {
        int rub = 140;
        float euro = Converter.rubleToEuro(rub);
        float dollar = Converter.rubleToDollar(rub);
        System.out.println(rub + " rubles are " + euro + " euro.");
        System.out.println(rub + " rubles are " + dollar + " dollar.");
        float in = 140;
        float out = Converter.rubleToEuro(in);
        checkConvertingRubToForeignCurrency(in, 2, out);
        float expectedDollar = 2.3333333F;
        out = Converter.rubleToDollar(in);
        checkConvertingRubToForeignCurrency(in, expectedDollar, out);
    }
}