package ru.job4j.condition;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        var a = new Point(0, 0);
        var b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to20then2dot23() {
        double expected = 2.23;
        var a = new Point(0, 1);
        var b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to21then1() {
        double expected = 1;
        var a = new Point(1, 1);
        var b = new Point(2, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to22then1dot41() {
        double expected = 1.41;
        var a = new Point(1, 1);
        var b = new Point(2, 2);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when111to222then1dot73() {
        double expected = 1.73;
        var a = new Point(1, 1, 1);
        var b = new Point(2, 2, 2);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to0221then3() {
        double expected = 3;
        var a = new Point(0, 0, 0);
        var b = new Point(2, 2, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}