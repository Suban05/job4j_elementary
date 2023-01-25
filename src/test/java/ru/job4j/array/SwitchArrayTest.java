package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwapInSquare() {
        int[] input = Square.calculate(5);
        int source = 3;
        int dest = 4;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {0, 1, 4, 16, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSwap2to1() {
        int[] input = {5, 4, 8, 10, 6, 3};
        int source = 2;
        int dest = 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 8, 4, 10, 6, 3};
        assertThat(result).containsExactly(expected);
    }
}
