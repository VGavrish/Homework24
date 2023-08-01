package org.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsTest {

    @Test
    public void testAdd() {
        int a = 5;
        int b = 7;
        int result = MathUtils.add(a,b);

        assertEquals(12, result);
    }

    @Test
    public void TestDivide() {
        int a = 10;
        int b = 2;
        double result = MathUtils.divide(a, b);

        assertEquals(5.0, result);
    }

    @Test
    public void testPower() {
        double base = 2.0;
        double exponent = 3.0;
        double result = MathUtils.power(base, exponent);

        assertEquals(8.0, result);
    }

    @Test
    public void testSqrt() {
        double number = 25.0;
        double result = MathUtils.sqrt(number);

        assertEquals(5.0, result);
    }
}
