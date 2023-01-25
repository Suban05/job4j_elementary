package ru.job4j.loop;

public class ArrayLoop {
    public static int[] numbers() {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i * 2 + 3;
        }
        return numbers;
    }

    public static void messageNumbers(int[] numbers) {
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = numbers();
        messageNumbers(numbers);
    }
}
