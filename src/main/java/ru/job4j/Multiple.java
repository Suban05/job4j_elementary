package ru.job4j;

public class Multiple {
    public static void main(String[] args) {

        int c = 1;
        for (int i = 1; i <= 9; i++) {
            var result = c * i;
            var expression = c + " * " + i + " = " + result;
            System.out.println(expression);
        }

    }
}
