package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int j = array.length - 1;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (count >= array.length) {
                break;
            }
            SwitchArray.swap(array, i, j);
            j--;
            count += 2;
        }
        return array;
    }
}