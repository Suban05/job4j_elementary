package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort1645290Then0124569() {
        int[] data = new int[] {1, 6, 4, 5, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 4, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort11056799Then0124569() {
        int[] data = new int[] {110, 56, 799};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {56, 110, 799};
        assertThat(result).containsExactly(expected);
    }
}