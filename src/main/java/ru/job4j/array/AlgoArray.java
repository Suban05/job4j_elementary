package ru.job4j.array;

public class AlgoArray {
    private static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        swapElements(array, 0, 3);
        swapElements(array, 2, 1);
        swapElements(array, 3, 4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}