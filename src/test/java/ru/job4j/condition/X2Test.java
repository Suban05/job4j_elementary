package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class X2Test {

    private void test_whenABCXThenExpected(int a, int b, int c, int x, int expected) {
        int rsl = X2.calc(a, b, c, x);
        Assert.assertEquals(expected, rsl);
    }

    @Test
    public void whenA10B0C0X2Then40() {
        test_whenABCXThenExpected(10, 0, 0, 2, 40);
    }

    @Test
    public void whenA1B1C1X1Then40() {
        test_whenABCXThenExpected(1, 1, 1, 1, 3);
    }

    @Test
    public void whenA0B1C1X1Then40() {
        test_whenABCXThenExpected(0, 1, 1, 1, 2);
    }

    @Test
    public void whenA1B1C0X1Then40() {
        test_whenABCXThenExpected(1, 1, 0, 1, 2);
    }

    @Test
    public void whenA1B1C1X0Then40() {
        test_whenABCXThenExpected(1, 1, 1, 0, 1);
    }
}