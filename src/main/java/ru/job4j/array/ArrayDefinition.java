package ru.job4j.array;

public class ArrayDefinition {
    public static String[] names() {
        String[] names = new String[4];
        names[0] = "Bob";
        names[1] = "Poul";
        names[2] = "Mark";
        names[3] = "Mike";
        return names;
    }

    public static void messageNames(String[] names) {
        for (String name
                :
                names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        short[] ages = new short[10];
        System.out.println(ages.length);
        String[] surnames = new String[100500];
        System.out.println(surnames.length);
        float[] prices = new float[40];
        System.out.println(prices.length);
        String[] names = names();
        messageNames(names);
    }
}
